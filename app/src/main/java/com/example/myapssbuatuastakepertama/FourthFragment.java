package com.example.myapssbuatuastakepertama;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapssbuatuastakepertama.Adapter.MusicAdapter;
import com.example.myapssbuatuastakepertama.Dummies.Music;
import com.example.myapssbuatuastakepertama.Entity.music;

import java.util.ArrayList;

//Tanggal Pengerjaan    : 04 June 2021
//Nama  : Tegar Lucky Oakley
//NIM   : 10118066
//Kelas : IF2
public class FourthFragment extends Fragment {

    private RecyclerView rvMusic;
    private ArrayList<music> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fourth, container, false);
        rvMusic = view.findViewById(R.id.rv_music);
        rvMusic.setHasFixedSize(true);
        list.addAll(Music.getListData());
        ShowlistMusic();

        return view;
    }
    void ShowlistMusic(){
        rvMusic.setLayoutManager(new LinearLayoutManager(getActivity()));
        MusicAdapter musicAdapter = new MusicAdapter(list);
        rvMusic.setAdapter(musicAdapter);
    }
}
