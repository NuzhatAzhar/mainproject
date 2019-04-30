package com.example.administrator.project;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CourseRegistrerd extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
FirebaseAuth auth;
FirebaseDatabase database;
DatabaseReference reference1;
FirebaseUser user;
EditText Phone_number,timing,days;
RadioGroup radio;
Button registr;
boolean check=false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_registrerd);
        init();
        registr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String std_phone=Phone_number.getText().toString();
                String std_timing=timing.getText().toString();

                String std_days=days.getText().toString();
                user=auth.getCurrentUser();
                if(std_phone==""){
                    Phone_number.setError("This field is mandatory");
                    check=true;
                }
                if(std_timing==""){
                    Phone_number.setError("This field is mandatory");
                    check=true;
                }
                if(std_days==""){
                    Phone_number.setError("This field is mandatory");
                    check=true;
                }
                if(!check){

                    //registeredUser(std_phone,std_timing,std_days);
                    Datasave(std_phone,std_days,std_timing,user.getUid());

                }
            }
        });




        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.numbers, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


    }

/*
    private void registeredUser(final String std_phone, final String std_timing, final String std_days) {
        auth.createUserWithEmailAndPassword(std_phone,std_timing).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    user=auth.getCurrentUser();

                    Datasave(std_phone,std_days,std_timing,user.getUid());
                    }
                else {
                    Toast.makeText(CourseRegistrerd.this, task.getException().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
*/

    private void Datasave(String std_phone, String std_days, String std_timing, String uid) {
        CourseRegisteredList courseRegisteredList=new CourseRegisteredList(std_phone,std_timing,std_days,uid);

        reference1.child(uid).setValue(courseRegisteredList).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){
                    startActivity(new Intent(CourseRegistrerd.this,Main2Activity.class));
                    Toast.makeText(CourseRegistrerd.this, "added", Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(CourseRegistrerd.this, task.getException().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void init() {
        auth=FirebaseAuth.getInstance();
        database=FirebaseDatabase.getInstance();
        reference1=database.getReference("Current Student").child(auth.getCurrentUser().getUid()).child("Course Detail");
        user=auth.getCurrentUser();
        Phone_number=findViewById(R.id.phone);
        timing=findViewById(R.id.timings);
        days=findViewById(R.id.days1);
        radio=findViewById(R.id.radiogroup);
        registr=findViewById(R.id.btn_Registr);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }


    }

