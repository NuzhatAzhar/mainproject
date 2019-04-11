package com.example.administrator.project;

import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.TabLayout;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ViewPager pager;
    FragmentAdapter adapter;
    ArrayList<android.support.v4.app.Fragment> list;
    TabLayout tabs;
Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        init();
        list.add(new Tajweed());
        list.add(new Learn());
        list.add(new New_Events());
        pager.setAdapter(adapter);
        tabs.setupWithViewPager(pager);

        tabs.getTabAt(0).setIcon(R.drawable.ic_import_contacts);

        tabs.getTabAt(1).setIcon(R.drawable.ic_wb_iridescent);
        tabs.getTabAt(2).setIcon(R.drawable.ic_streetview);

     /*   btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder =new AlertDialog.Builder(Main2Activity.this);
                builder.setMessage("hello");
                builder.setTitle("SURTER");
                builder.show();


            }
        });*/
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        builder.setTitle("warning");
        builder.setIcon(R.mipmap.ic_launcher_round);
        builder.setMessage("Are you sure you want to exit");
        builder.setCancelable(false);
        builder.setPositiveButton("yes",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.exit(0);
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
           dialog.dismiss();
            }
        }).show();

    }


    private void init() {
        pager=findViewById(R.id.view_pager);
        list=new ArrayList<>();
       adapter=new FragmentAdapter(getSupportFragmentManager(),list);
        tabs=findViewById(R.id.tabs);
        btn1=findViewById(R.id.btn_online1);

    }


}

