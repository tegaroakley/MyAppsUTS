package com.example.myapssbuatuastakepertama.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.myapssbuatuastakepertama.Entity.music;
import com.example.myapssbuatuastakepertama.R;

import java.util.ArrayList;


    public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.ListViewHolder> {

        private ArrayList<music> musicList;

        public MusicAdapter(ArrayList<music> list) {
            this.musicList = list;
        }

        @Override
        public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.foufrag_item, parent, false);
            return new ListViewHolder(view);

        }

        @Override
        public void onBindViewHolder(ListViewHolder holder, int position) {

            music day = musicList.get(position);
            Glide.with(holder.itemView.getContext())
                    .load(day.getThumbnail())
                    .apply(new RequestOptions().override(300, 300))
                    .into(holder.imgPhoto);
            holder.mTitle.setText(day.getTitle());
            holder.mArtist.setText(day.getArtist());

        }

        @Override
        public int getItemCount() {
            return musicList.size();
        }

        public class ListViewHolder extends RecyclerView.ViewHolder {
            ImageView imgPhoto;
            TextView mTitle, mArtist;

            public ListViewHolder(@NonNull View itemView) {
                super(itemView);
                imgPhoto = itemView.findViewById(R.id.img_music);
                mTitle = itemView.findViewById(R.id.music_title);
                mArtist = itemView.findViewById(R.id.artist);
            }
        }
    }
