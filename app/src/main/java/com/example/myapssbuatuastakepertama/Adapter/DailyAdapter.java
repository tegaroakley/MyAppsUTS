package com.example.myapssbuatuastakepertama.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.myapssbuatuastakepertama.Entity.daily;
import com.example.myapssbuatuastakepertama.R;

import java.util.ArrayList;

//Tanggal Pengerjaan    : 04 June 2021
//Nama  : Tegar Lucky Oakley
//NIM   : 10118066
//Kelas : IF2
public class DailyAdapter extends RecyclerView.Adapter<DailyAdapter.ListViewHolder> {

    private ArrayList<daily> itemDaily;

    public DailyAdapter(ArrayList<daily> itemDaily) {
        this.itemDaily = itemDaily;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.secfrag_item,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        daily day = itemDaily.get(position);
        Glide.with(holder.itemView.getContext())
                .load(day.getImg())
                .apply(new RequestOptions().override(1000,1000))
                .into(holder.imgPhoto);
        holder.tvTitle.setText(day.getActName());
        holder.tvTime.setText(day.getTime());

    }

    @Override
    public int getItemCount() {
        return itemDaily.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvTitle, tvTime;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_daily);
            tvTitle = itemView.findViewById(R.id.activity_name);
            tvTime = itemView.findViewById(R.id.tv_detail_daily);
        }
    }
}
