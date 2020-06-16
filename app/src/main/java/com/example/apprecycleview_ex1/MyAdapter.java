package com.example.apprecycleview_ex1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Placeholder;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.PlaceViewHolder> {

    private Context context;
    private int[] mPlaceList;

    public MyAdapter(Context context, int[] mPlaceList){
        this.context=context;
        this.mPlaceList=mPlaceList;
    }

    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_custom_layout,parent,false);
        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final PlaceViewHolder holder, int position) {
           holder.imageView.setImageResource(mPlaceList[position]);
           holder.imageView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent =new Intent(context,MainDetail.class);
                   intent.putExtra("image",mPlaceList[holder.getAdapterPosition()]);
                   context.startActivity(intent);
               }
           });
    }

    @Override
    public int getItemCount() {
        return mPlaceList.length;
    }
    class  PlaceViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;

        public PlaceViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView =itemView.findViewById(R.id.image_item);

        }
    }
}
