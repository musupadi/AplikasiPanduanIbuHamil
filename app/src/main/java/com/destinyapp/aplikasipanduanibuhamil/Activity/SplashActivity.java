package com.destinyapp.aplikasipanduanibuhamil.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
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
        handler.postDelayed(new Runnable() {
            public void run() {
                changeActivity();
            }
        }, 3000); //3000 L = 3 detik
//        animation.addAnimatorListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animator) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animator) {
//                animation.pauseAnimation();
//                changeActivity();
//            }
//
//            @Override
//            public void onAnimationCancel(Animator animator) {
//                animation.pauseAnimation();
//                changeActivity();
//            }
//
//            @Override
//            public void onAnimationRepeat(Animator animator) {
//
//            }
//        });
    }
    private void changeActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        finishAffinity();
        startActivity(intent);
    }
}
