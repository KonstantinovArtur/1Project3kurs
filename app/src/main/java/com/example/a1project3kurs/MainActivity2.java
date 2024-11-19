package com.example.a1project3kurs;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private ImageView animationIV;
    private Button startBtn;
    private Button pauseBtn;
    private AnimationDrawable frameAnimation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        animationIV = findViewById(R.id.animImageView);
        startBtn = findViewById(R.id.startButton);
        pauseBtn = findViewById(R.id.pauseButton);
        frameAnimation = (AnimationDrawable) animationIV.getDrawable();
        frameAnimation.start();
        Button textView = findViewById(R.id.startButton);
        Button textView1 = findViewById(R.id.pauseButton);


        Animation fadeInScale = AnimationUtils.loadAnimation(this, R.anim.fade_in_scale);


        textView.setVisibility(View.VISIBLE);
        textView.startAnimation(fadeInScale);

        textView1.setVisibility(View.VISIBLE);
        textView1.startAnimation(fadeInScale);


        startBtn.setOnClickListener(v -> {
            if (!frameAnimation.isRunning()) {
                frameAnimation.start();
            }
        });
        pauseBtn.setOnClickListener(v -> {
            if (frameAnimation.isRunning()) {
                frameAnimation.stop();
            }
        });
    }

}