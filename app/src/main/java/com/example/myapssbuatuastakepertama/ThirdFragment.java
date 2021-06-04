package com.example.myapssbuatuastakepertama;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.myapssbuatuastakepertama.Adapter.GalleryAdapter;
import com.example.myapssbuatuastakepertama.Dummies.Gallery;
import com.example.myapssbuatuastakepertama.Entity.gallery;

import java.util.ArrayList;

//Tanggal Pengerjaan    : 04 June 2021
//Nama  : Tegar Lucky Oakley
//NIM   : 10118066
//Kelas : IF2
public class ThirdFragment extends Fragment {

    private RecyclerView rv;
    private ArrayList<gallery> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_third,container,false);
        rv = view.findViewById(R.id.rv_gallery);
        rv.setHasFixedSize(true);
        list.addAll(Gallery.getListData());
        ShowListGallery();
        return view;
    }

    void ShowListGallery(){
        rv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        GalleryAdapter galleryAdapter = new GalleryAdapter(list);
        rv.setAdapter(galleryAdapter);
    }
}