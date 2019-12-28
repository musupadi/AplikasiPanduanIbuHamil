package com.destinyapp.aplikasipanduanibuhamil.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.destinyapp.aplikasipanduanibuhamil.Adapter.AdapterSlideMitos;
import com.destinyapp.aplikasipanduanibuhamil.R;

public class MitosActivity extends AppCompatActivity {
    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;
    private AdapterSlideMitos sliderAdapter;
    private Button btnBack,btnNext,btnPlay,btnPause,btnStop;
    private TextView[] mDots;
    private int CurrentPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mitos);

        mSlideViewPager = findViewById(R.id.SlideViewPager);
        mDotLayout = findViewById(R.id.dotSlayout);
        btnBack = findViewById(R.id.btnBack);
        btnNext = findViewById(R.id.btnNext);

        sliderAdapter = new AdapterSlideMitos(MitosActivity.this);
        mSlideViewPager.setAdapter(sliderAdapter);
        addDotsIndicator(0);

        mSlideViewPager.addOnPageChangeListener(viewList);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSlideViewPager.setCurrentItem(CurrentPage +1);
                if (CurrentPage == 11){
                    Intent intent = new Intent(MitosActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSlideViewPager.setCurrentItem(CurrentPage -1);
            }
        });
    }

    public void addDotsIndicator(int posistion){
        mDots = new TextView[12];
        mDotLayout.removeAllViews();
        for (int i = 0;i <mDots.length;i++){
            mDots[i] = new TextView(MitosActivity.this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorPrimary));

            mDotLayout.addView(mDots[i]);
        }
        if(mDots.length > 0){
            mDots[posistion].setTextColor(getResources().getColor(R.color.colorWhite));
        }
    }

    ViewPager.OnPageChangeListener viewList = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            addDotsIndicator(i);
            CurrentPage = i;

            if(CurrentPage==0){
                btnNext.setEnabled(true);
                btnBack.setEnabled(false);
                btnBack.setVisibility(View.INVISIBLE);
                btnNext.setText("Next");
                btnBack.setText("");
            }else if(i==mDots.length-1){
                btnNext.setEnabled(true);
                btnBack.setEnabled(true);
                btnBack.setVisibility(View.VISIBLE);
                btnNext.setText("Finish");
                btnBack.setText("Back");
            }else{
                btnNext.setEnabled(true);
                btnBack.setEnabled(true);
                btnBack.setVisibility(View.VISIBLE);
                btnNext.setText("Next");
                btnBack.setText("back");
            }
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}
