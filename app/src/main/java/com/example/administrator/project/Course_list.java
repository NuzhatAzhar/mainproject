package com.example.administrator.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Course_list extends BaseActivity  {
    Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);
        btn1=findViewById(R.id.BasicRecitation);
        btn2=findViewById(R.id.ReadTajweed);
        btn3=findViewById(R.id.QuranMemorization);
        btn4=findViewById(R.id.QuranTranslation);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Course_list.this,CourseRegistrerd.class));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Course_list.this,CourseRegistrerd.class));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Course_list.this,CourseRegistrerd.class));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Course_list.this,CourseRegistrerd.class));
            }
        });

        }

   /* @Override
    public void onBackPressed() {
        startActivity(new Intent(Course_list.this,Main2Activity.class));
    }*/
}
