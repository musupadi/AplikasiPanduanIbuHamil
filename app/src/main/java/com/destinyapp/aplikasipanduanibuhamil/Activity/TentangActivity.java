package com.destinyapp.aplikasipanduanibuhamil.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.destinyapp.aplikasipanduanibuhamil.R;

public class TentangActivity extends AppCompatActivity {
    boolean onClicked = true;
    ImageView kembali,play;
    MediaPlayer SuaraLagu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        play=(ImageView)findViewById(R.id.ivMusikPlay);
        MediaPlayer SuaraLagu2 = MediaPlayer.create(TentangActivity.this,R.raw.tentang);
        SuaraLagu2.start();
        SuaraLagu = MediaPlayer.create(TentangActivity.this,R.raw.about);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Drawable DrawableHapus = getResources().getDrawable(R.drawable.pause);
                final Drawable DrawablePlay = getResources().getDrawable(R.drawable.play);
                if (onClicked){
                    play.setImageDrawable(DrawableHapus);
                    onClicked=false;
                    SuaraLagu.start();
                }else{
                    play.setImageDrawable(DrawablePlay);
                    onClicked=true;
                    SuaraLagu.pause();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        SuaraLagu.stop();
        TentangActivity.super.onBackPressed();
    }
}
