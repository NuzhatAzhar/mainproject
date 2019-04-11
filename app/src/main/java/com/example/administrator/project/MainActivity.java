package com.example.administrator.project;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img=findViewById(R.id.logo);
        textView=findViewById(R.id.tagline);
        Handler handler=new Handler();

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                img.setVisibility(View.VISIBLE);

                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        };

        handler.postDelayed(runnable,4000);


    }

/*
        Animation animation=AnimationUtils.loadAnimation(this,R.anim.anim);
        img.startAnimation(animation);
*/

    }


