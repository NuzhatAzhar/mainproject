package com.example.administrator.project;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Learn extends Fragment {
    Button bpara1, bpara2, bpara3, bpara4;
    ProgressDialog dialog;

    public Learn() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_learn, container, false);
        bpara1 = view.findViewById(R.id.para1);
        bpara2 = view.findViewById(R.id.para2);
        bpara3 = view.findViewById(R.id.para3);
        bpara4 = view.findViewById(R.id.para4);

        bpara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),para1.class));



            }
        });
        bpara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),para2.class));


            }
        });
        bpara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),para3.class));

            }
        });
        bpara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),para4.class));

            }
        });


        return view;
    }


}


