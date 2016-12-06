package com.ebookfrenzy.coffepicker45;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sergio on 12/5/2016.
 */

public class MyAdapter extends ArrayAdapter<String>
{
    public MyAdapter (Context context, String[]values)
    {
        super (context,R.layout.row_layout_2,values);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater theInflater = LayoutInflater.from(getContext());
        View theView = theInflater.inflate(R.layout.row_layout_2,parent,false);
        String coffeShops=getItem(position);
        TextView theTextView = (TextView)theView.findViewById(R.id.textViewOne);

        theTextView.setText(coffeShops);
        ImageView theImageView =(ImageView)theView.findViewById(R.id.imageViewOne);
        theImageView.setImageResource(R.mipmap.dot);
        return  theView;
    }
}
