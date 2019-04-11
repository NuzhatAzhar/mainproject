package com.example.administrator.project;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
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

public class Student_Signup extends AppCompatActivity {
    CardView cardview1;
    EditText username1,password1,retype_password1,email_user1;

    Button signup_btn1;
    FirebaseAuth auth;
    FirebaseUser firebaseUser;
    FirebaseDatabase database;
    DatabaseReference reference;
    ProgressDialog dialog;
    boolean check=false;
    Snackbar snackbar;
    String emailPattern="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_student__signup);

        init();
        auth = FirebaseAuth.getInstance();
        firebaseUser = auth.getCurrentUser();
        dialog = new ProgressDialog(this);
        dialog.setTitle("Uploading");
        dialog.setMessage("Please Wait...");


        //testwifi();

        signup_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=username1.getText().toString();
                String pass=password1.getText().toString();
                String retype_pass=retype_password1.getText().toString();
                String email=email_user1.getText().toString();

              //  startActivity(new Intent(Student_Signup.this,BaseActivity.class));


                if(user==""){
                    username1.setError("This field is mandatory");
                    check=true;
                }
                if(pass==""){
                    password1.setError("please Enter Password");
                    check=true;
                }
                if(pass.length()<=5){
                    password1.setError("Alteast 5 character");
                    check=true;
                }
                if(retype_pass==""){
                    retype_password1.setError("This Field is mansatory");
                    check=true;
                }
                if(!pass.equals(retype_pass)){
                    retype_password1.setError("Password is not match");
                    check=true;
                }
                if(!check){
                    dialog.show();
                    signupUser(user,pass,email);
                }



            }
        });




    }


    /*private void testwifi() {
        ConnectivityManager manager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = manager.getActiveNetworkInfo();
        NetworkCapabilities capabilities = manager.getNetworkCapabilities(manager.getActiveNetwork()));

        if (info != null && info.isConnected()) {

            if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)) {
                showSnackBar(1);
            } else {
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR);
                showSnackBar(2);
            }

        }
        else {
            showSnackBar(0);
        }
    }

    private void showSnackBar(int check) {
    }
*/

    private void signupUser(   final String user, final String pass, final String email) {
        auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    firebaseUser=auth.getCurrentUser();

                 Datasave(user,pass,email,firebaseUser.getUid());


                }

                else {
                    Toast.makeText(Student_Signup.this, task.getException().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void Datasave(String user, String pass, String email, String uid) {
        Student_list student_list=new Student_list(user,pass,email,uid);
        reference.child(uid).setValue(student_list).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){
                    Toast.makeText(Student_Signup.this, "added", Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(Student_Signup.this, task.getException().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        startActivity(new Intent(Student_Signup.this,BaseActivity.class));
    }

    private void saveData() {
    }


    private void init() {
        username1=findViewById(R.id.username);
        email_user1=findViewById(R.id.email_user);
        password1=findViewById(R.id.password);
        retype_password1=findViewById(R.id.retype_password);
        signup_btn1=findViewById(R.id.btn_signUp);
        auth=FirebaseAuth.getInstance();

        database=FirebaseDatabase.getInstance();
        reference=database.getReference("Current Student");
    }
}
