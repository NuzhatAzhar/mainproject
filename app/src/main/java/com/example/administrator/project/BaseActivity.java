package com.example.administrator.project;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class BaseActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    Toolbar toolbar;
    NavigationView navigationView;
    FragmentManager fragmentManager;
    FragmentTransaction transaction;
    FragmentTransaction transaction2;
    public static FrameLayout frameLayout;

    TextView username, email;
    FirebaseAuth auth;
    FirebaseUser user;
    FirebaseDatabase database;
    DatabaseReference databaseReference;
    FirebaseStorage storage;
    StorageReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.nav_drawer);

        NavigationView navigationView = findViewById(R.id.navigation_view);
        View view = navigationView.getHeaderView(0);
        username = view.findViewById(R.id.username);
        email = view.findViewById(R.id.email_user);
        //imageView=view.findViewById(R.id.header_image);

        init();
        transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.frag_container,new Home_Fragment()).addToBackStack( "tag" );
        transaction.commit();

        setUpDrawer();
        navigationView.setCheckedItem(R.id.nv_account);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.nv_account:
                        showFragment(new Home_Fragment());
                        break;
                    case R.id.nv_notifications:
                        showFragment(new Notification_fragment());
                        break;
                    case R.id.nv_settings:
                        showFragment(new Setting_Fragment1());
                        break;
                    case R.id.nv_logout:
                        AlertDialog.Builder builder =new AlertDialog.Builder(BaseActivity.this);
                        builder.setTitle("Alert");
                        builder.setMessage("Are you want to sure to logout?");
                        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                auth.signOut();
                           startActivity(new Intent(BaseActivity.this,Main2Activity.class));
                           }
                        }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).show();

                        break;
                }
                drawerLayout.closeDrawer(Gravity.START);
                return true;
            }


        });
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                User user = dataSnapshot.getValue(User.class);
              Toast.makeText(BaseActivity.this, user.getUname(), Toast.LENGTH_SHORT).show();


                username.setText(dataSnapshot.child("user").getValue().toString());
                email.setText(user.getEmail());

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void setUpDrawer() {
        setSupportActionBar(toolbar);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    private void showFragment(Fragment fragment) {

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frag_container, fragment);
        transaction.commit();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {

        startActivity(new Intent(BaseActivity.this,Main2Activity.class));
finish();
        }


        //startActivity(new Intent(BaseActivity.this,Main2Activity.class));
        /*AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("warning");
        builder.setIcon(R.mipmap.ic_launcher_round);
        builder.setMessage("Are you sure you want to exit");
        builder.setCancelable(false);
        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
          System.exit(0);
          finish();
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).show();*/


    protected void init() {
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigation_view);
        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();
        database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference("Current Student").child(user.getUid());
        storage = FirebaseStorage.getInstance();
        drawerLayout = findViewById(R.id.drawer);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_navigation, R.string.close_navigation);
        fragmentManager = getSupportFragmentManager();


    }
}