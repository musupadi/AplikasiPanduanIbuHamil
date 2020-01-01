package com.destinyapp.aplikasipanduanibuhamil.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;
import com.destinyapp.aplikasipanduanibuhamil.R;

public class SplashActivity extends AppCompatActivity {
    LottieAnimationView animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        animation = findViewById(R.id.loading);

        final Handler handler = new Handler();
        final MediaPlayer SuaraLagu = MediaPlayer.create(SplashActivity.this,R.raw.welcome);
        SuaraLagu.start();
        handler.postDelayed(new Runnable() {
            public void run() {
                changeActivity();
            }
        }, 3000); //3000 L = 3 detik

    }
    private void changeActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        finishAffinity();
        startActivity(intent);
    }
}
