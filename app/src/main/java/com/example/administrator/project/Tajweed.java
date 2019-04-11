package com.example.administrator.project;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tajweed extends Fragment {
    Button btn_tajweed,btn_tfseer,btn_online;
    FirebaseAuth auth;


    public Tajweed() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        auth=FirebaseAuth.getInstance();


        final View view= inflater.inflate(R.layout.fragment_tajweed, container, false);

        btn_tajweed=view.findViewById(R.id.btn_tajwed);

        btn_tfseer=view.findViewById(R.id.btn_taser);
       btn_tajweed.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getContext(), TajweedCourse.class);
               startActivity(intent);
           }
       });
        Button alert=view.findViewById(R.id.btn_online1);
     alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Login.class);
                startActivity(intent);

               /* AlertDialog.Builder builder =new AlertDialog.Builder(getContext());
                View view1=getLayoutInflater().inflate(R.layout.login_stdddd,null);

                final EditText email_et=view1.findViewById(R.id.login_email);
                final EditText password_et=view1.findViewById(R.id.login_pass);
                Button login_btn1=view1.findViewById(R.id.login_btn);
                Button sign_up=view1.findViewById(R.id.login_signup_btn);
                login_btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String email=email_et.getText().toString();
                        String password=password_et.getText().toString();
                        signup(email,password);

                    }
                });
                sign_up.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       Intent intent = new Intent(getContext(), Student_Signup.class);
                        startActivity(intent);
                    }
                });
                builder.setView(view1);
                builder.show();
*/
/*
                sign_up.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       */
/* View view2=getLayoutInflater().inflate(R.layout.signup,null);

                        final EditText email_signup=view2.findViewById(R.id.email);
                        final EditText pass_signup=view2.findViewById(R.id.pass);
                        String email=email_signup.getText().toString();
                        String pass=pass_signup.getText().toString();
                        signupUser(email,pass);
                        email_signup.setText("");
                        pass_signup.setText("");
*//*

                        Intent intent = new Intent(getContext(), Student_Signup.class);
                        startActivity(intent);

                    }
                });
*/

            }
        });

        return view;

    }

/*
    private void signupUser(String name, String pass) {
        auth.createUserWithEmailAndPassword(name,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(getContext(), "Signup", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getContext(),task.getException().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
*/




}
