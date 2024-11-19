package com.example.a1project3kurs;

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

public class MainActivity3 extends AppCompatActivity {

    private ImageView img;
    private Button startBtn;
    private Button pauseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        img=findViewById(R.id.img_blink);
        startBtn=findViewById(R.id.start_tween);
        pauseBtn=findViewById(R.id.pause_tween);
        Button textViewAnimated = findViewById(R.id.start_tween);
        Button textViewAnimated1 = findViewById(R.id.pause_tween);

        Animation blinkanimation = AnimationUtils.loadAnimation(this,R.anim.blink_animation);
        Animation slideIn = AnimationUtils.loadAnimation(this, R.anim.animation4);
        textViewAnimated.startAnimation(slideIn);
        textViewAnimated1.startAnimation(slideIn);

        img.startAnimation(blinkanimation);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { img.startAnimation(blinkanimation); }
        });
        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { img.clearAnimation(); }
        });

    }
}