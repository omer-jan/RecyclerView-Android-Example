package com.example.zubairakrami.recyclerview;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;

import java.util.List;

import static android.view.LayoutInflater.*;

public class RecylerAdapter extends RecyclerView.Adapter<RecylerAdapter.MyViewHolder>
{

    private List<String> list;
    public RecylerAdapter(List<String> list)
    {
        this.list=list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        //TextView textView = (TextView) from(parent.getContext()).inflate(R.layout.text_view_layout,parent,false);
        //TextView textView=LayoutInflater.from(parent.getContext()).inflate(R.layout.text_view_layout,parent,false);
        TextView textView=(TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.text_view_layout,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(textView);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.VersionName.setText((list.get(position)));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public  static class  MyViewHolder extends RecyclerView.ViewHolder {
        TextView VersionName;
        public MyViewHolder(TextView itemView) {
            super(itemView);
            VersionName=itemView;
        }
    }

}
