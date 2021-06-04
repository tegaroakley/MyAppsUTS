package com.example.myapssbuatuastakepertama.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.myapssbuatuastakepertama.Entity.gallery;
import com.example.myapssbuatuastakepertama.R;

import java.util.ArrayList;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ListViewHolder> {
    private ArrayList<gallery> picList;

    public GalleryAdapter(ArrayList<gallery> picList) {
        this.picList = picList;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.thifrag_item,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int i) {
        gallery day = picList.get(i);
        Glide.with(holder.itemView.getContext())
                .load(day.getGalleryItems())
                .apply(new RequestOptions().override(1000,1000))
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return picList.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        public ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_gallery);
        }
    }
}