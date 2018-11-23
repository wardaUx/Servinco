package com.example.wardauzair.profilescreens;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class PostAdapterLight extends RecyclerView.Adapter<PostAdapterLight.ViewHolder> {

    private Context mContext;
    private ArrayList<PostItemsLight> list ;

    public PostAdapterLight(Context mContext, ArrayList<PostItemsLight> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_posts_light,parent, false );
        return new ViewHolder(view );


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        PostItemsLight postItems = list.get(i);
        viewHolder.tvPostText.setText(postItems.getPostText());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvPostText ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvPostText =  itemView.findViewById(R.id.tvPostText);
        }

    }
}

