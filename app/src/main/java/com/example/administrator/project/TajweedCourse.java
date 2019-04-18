package com.example.administrator.project;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TajweedCourse extends AppCompatActivity {

    private static final int REQUEST_PHONE_CALL =1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tajweed_course);
    }

    public void facebookpage(View view) {
        Uri uri = Uri.parse("https://www.facebook.com/madarsaalfurqan/?ref=bookmarks"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void call2(View view) {

        if (ContextCompat.checkSelfPermission(TajweedCourse.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(TajweedCourse.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
        }
        else
        {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:03142867567"));//change the number
            startActivity(callIntent);
        }
        locationAndContactsTask();
    }

    private void locationAndContactsTask() {
        String[] perms = { Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.CALL_PHONE };
    }
}
