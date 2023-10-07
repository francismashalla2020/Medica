package com.thinkbold.medica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imageLogo;
    Animation anim;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        imageLogo = findViewById(R.id.imageHood);
        textview = findViewById(R.id.textHood);

        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }
            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent;
                // intent = new Intent(MainActivity.this, Distance.class);
                intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);
            }
            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        imageLogo.startAnimation(anim);
        textview.startAnimation(anim);
    }
}