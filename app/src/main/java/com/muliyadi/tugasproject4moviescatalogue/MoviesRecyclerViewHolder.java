package com.muliyadi.tugasproject4moviescatalogue;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MoviesRecyclerViewHolder extends RecyclerView.ViewHolder {
    public ImageView image;
    public TextView title, detail;
    public Button btn_hapus;
    public CardView cardView;

    public MoviesRecyclerViewHolder(@NonNull View itemView, int viewType) {
        super(itemView);
        if (viewType == 1) {
            cardView = itemView.findViewById(R.id.list_card);
            image = itemView.findViewById(R.id.list_img);
            title = itemView.findViewById(R.id.list_title);
            btn_hapus = itemView.findViewById(R.id.btn_hapus);
            detail = itemView.findViewById(R.id.list_detail);
        } else {
            cardView = itemView.findViewById(R.id.list_card);
            image = itemView.findViewById(R.id.list_img);
            title = itemView.findViewById(R.id.list_title);
        }
    }
}
