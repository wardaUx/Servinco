package com.example.wardauzair.profilescreens;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class PostAdapterDark extends RecyclerView.Adapter<PostAdapterDark.ViewHolder> {

    private Context mContext;
    private ArrayList<PostItems> list ;

    public PostAdapterDark(Context mContext, ArrayList<PostItems> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_custom_cards,parent, false );
        return new ViewHolder(view );


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        PostItems postItems = list.get(i);
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
