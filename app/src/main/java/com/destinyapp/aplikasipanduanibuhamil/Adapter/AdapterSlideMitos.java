package com.destinyapp.aplikasipanduanibuhamil.Adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.destinyapp.aplikasipanduanibuhamil.R;

public class AdapterSlideMitos extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public AdapterSlideMitos(Context context){
        this.context = context;
    }
    public int[] id ={
            0,
            1,
            2,
            3,
            4,
            5
    };

    public int[] slide_image ={
            R.drawable.mitos1,
            R.drawable.mitos2,
            R.drawable.mitos3,
            R.drawable.mitos4,
            R.drawable.mitos5,
            R.drawable.mitos6,
            R.drawable.mitos7,
            R.drawable.mitos8,
            R.drawable.mitos9,
            R.drawable.mitos10,
            R.drawable.mitos11,
            R.drawable.mitos12,
    };

    @Override
    public int getCount() {
        return slide_image.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_mitos,container,false);

        ImageView slideImageView = (ImageView)view.findViewById(R.id.ivMitos);


        slideImageView.setImageResource(slide_image[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
