package servinco.infosys_sol.com.commons;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

import servinco.infosys_sol.com.R;

public class FavouritesAdapter extends RecyclerView.Adapter<FavouritesAdapter.ViewHolder> {

    ArrayList<String> arrayList;
    Context mContext;
    Boolean check = false;

    public FavouritesAdapter(ArrayList<String> arrayList, Context context) {
        this.arrayList = arrayList;
        this.mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        String position = arrayList.get(i);
        viewHolder.favButton.setText(position);


    }

    @Override
    public int getItemCount() {

        return arrayList.size();
    }


    public  class ViewHolder extends RecyclerView.ViewHolder
    {
        Button favButton;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            favButton = itemView.findViewById(R.id.favButton);
        }


    }


}
