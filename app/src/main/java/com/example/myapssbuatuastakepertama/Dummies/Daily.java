package com.example.myapssbuatuastakepertama.Dummies;

import com.example.myapssbuatuastakepertama.Entity.daily;
import com.example.myapssbuatuastakepertama.R;

import java.util.ArrayList;

//Tanggal Pengerjaan    : 04 June 2021
//Nama  : Tegar Lucky Oakley
//NIM   : 10118066
//Kelas : IF2
public class Daily {
    private static String[] actName ={
            "Bangun Tidur",
            "Sarapan",
            "Kelas",
            "Brainstoriming Konsep Foto",
            "Main Game",
            "Sleep"

    };

    private static String[] time ={
            "05.30",
            "10.00",
            "07.00 - 16.00",
            "20.00",
            "Free Time",
            "01.00"

    };

    private static int[] img ={
            R.drawable.ic_digital_clock,
            R.drawable.ic_coffee,
            R.drawable.ic_notebook,
            R.drawable.ic_notebook,
            R.drawable.ic_console,
            R.drawable.ic_clock
    };

    public static ArrayList<daily> getListData(){
        ArrayList<daily> list = new ArrayList<>();
        for (int position = 0; position < actName.length; position++){
            daily day = new daily();
            day.setActName(actName[position]);
            day.setTime(time[position]);
            day.setImg(img[position]);
            list.add(day);
        }
        return list;
    }
}
