package com.example.administrator.project;


import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;


/**
 * A simple {@link Fragment} subclass.
 */
public class New_Events extends Fragment {
    ImageView icon1,icon2,icon3;
    TextView view1,view2;
    int REQUEST_PHONE_CALL;

    private GoogleMap mMap;
    public New_Events() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_new__events, container, false);
        icon1=view.findViewById(R.id.locat);
        icon2=view.findViewById(R.id.call1);
        icon3=view.findViewById(R.id.Facebook);
       // view1=view.findViewById(R.id.location_text);
        //view2=view.findViewById(R.id.call_text);
       icon1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(getContext(),MapsActivity.class));
           }
       });
      /* view1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(getContext(),MapsActivity.class));
           }
       });*/
       icon2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               if (ContextCompat.checkSelfPermission(getContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                   ActivityCompat.requestPermissions((Activity) getContext(), new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
               }
               else
               {
                   Intent callIntent = new Intent(Intent.ACTION_CALL);
                   callIntent.setData(Uri.parse("tel:03142867567"));//change the number
                   startActivity(callIntent);
               }

           }
       });
       /*view2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               if (ContextCompat.checkSelfPermission(getContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                   ActivityCompat.requestPermissions((Activity) getContext(), new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
               }
               else
               {
                   Intent callIntent = new Intent(Intent.ACTION_CALL);
                   callIntent.setData(Uri.parse("tel:03142867567"));//change the number
                   startActivity(callIntent);
               }

           }
       });
       */
       /* public void fb(View view) {
            Uri uri = Uri.parse("https://www.facebook.com/madarsaalfurqan/?ref=bookmarks"); // missing 'http://' will cause crashed
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }*/
       icon3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Uri uri = Uri.parse("https://www.facebook.com/madarsaalfurqan/?ref=bookmarks"); // missing 'http://' will cause crashed
               Intent intent = new Intent(Intent.ACTION_VIEW, uri);
               startActivity(intent);
           }
       });


        return view;
    }


}
