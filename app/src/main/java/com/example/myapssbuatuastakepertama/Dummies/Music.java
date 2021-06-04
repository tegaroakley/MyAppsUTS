package com.example.myapssbuatuastakepertama.Dummies;

import com.example.myapssbuatuastakepertama.Entity.music;
import com.example.myapssbuatuastakepertama.R;

import java.util.ArrayList;

//Tanggal Pengerjaan    : 04 June 2021
//Nama  : Tegar Lucky Oakley
//NIM   : 10118066
//Kelas : IF2
public class Music {
    private static String[] title ={
            "Sydney",
            "Sydney",
            "Sydney",
            "Sydney",
            "Sydney",
            "Sydney",
            "Sydney"
    };

    private static String[] artist={
            "Rich Brian",
            "Rich Brian",
            "Rich Brian",
            "Rich Brian",
            "Rich Brian",
            "Rich Brian",
            "Rich Brian"
    };

    private static int[] thumbnail={
            R.drawable.artwork_440x440,
            R.drawable.artwork_440x440,
            R.drawable.artwork_440x440,
            R.drawable.artwork_440x440,
            R.drawable.artwork_440x440,
            R.drawable.artwork_440x440,
            R.drawable.artwork_440x440
    };

    public static ArrayList<music> getListData(){
        ArrayList<music> list = new ArrayList<>();
        for (int position = 0; position < title.length; position++){
            music day = new music();
            day.setTitle(title[position]);
            day.setArtist(artist[position]);
            day.setThumbnail(thumbnail[position]);
            list.add(day);
        }
        return list;
    }
}
