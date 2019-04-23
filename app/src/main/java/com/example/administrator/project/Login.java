package com.example.administrator.project;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Login extends AppCompatActivity {
    EditText user_login;
    EditText user_pass;
    Button login_btn;
    FirebaseUser user;

    FirebaseAuth auth;
    FirebaseDatabase database;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        if (user != null) {
            startActivity(new Intent(Login.this,BaseActivity.class));
        }
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=user_login.getText().toString();
                String pass=user_pass.getText().toString();
                Userauth(email,pass);

            }
        });
    }

    private void Userauth(String email, String pass) {
        auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    user=auth.getCurrentUser();
                    startActivity(new Intent(Login.this,BaseActivity.class));
                }
                else {

                }
            }
        });

    }


    private void init() {
      user_login=findViewById(R.id.login_email);
      user_pass=findViewById(R.id.login_pass);
      auth=FirebaseAuth.getInstance();
      login_btn=findViewById(R.id.login_btn);
      database=FirebaseDatabase.getInstance();
      reference=database.getReference("Current Student");
      user=auth.getCurrentUser();
    }

    public void signin(View view) {
        startActivity(new Intent(Login.this,Student_Signup.class));
    }
}
