package com.example.bob.androidpracseven;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

//If I comment out the generic type <MyAdapter.ViewHolder>, everything breaks.
public class MyAdapter extends RecyclerView.Adapter <MyAdapter.ViewHolder> {

    private String[] mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public ViewHolder(TextView v) {
            super(v);
            mTextView = v;
        }
    }

    public MyAdapter(String[] myDataset){
        mDataset = myDataset;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // create a new view, the inflater will create a View object,
        // which corresponds to my_text_view.
        TextView v = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_text_view, parent, false);
        // RecyclerView just won't work without the ViewHolder,
        // which represents each and individual Views inside the
        // scrollable list.
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //This is kinda tricky to understand; so, you know how
        //ViewHolder will eliminate the items being displayed from the view
        //to optimize things right?
        //RecyclerView.Adapter does just that through this method,
        //which is called everytime when view is eliminated, and new one
        //needs to be displayed.
        //I guess the below line gives that illusion of mutating the
        //latest TextView with the text needed to appear.
        holder.mTextView.setText(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
