package com.example.administrator.project;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterPicasso extends PagerAdapter {
    private Context context;
    private ArrayList<String> Imageurls;

    public AdapterPicasso(Context context, ArrayList<String> imageurls) {
        this.context = context;
        Imageurls = imageurls;
    }

    @Override
    public int getCount() {
        return Imageurls.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView=new ImageView(context);

        Picasso.with(context)
                .load(Imageurls.get(position))
                .fit()
                .into(imageView);
        container.addView(imageView);
        return imageView;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}

