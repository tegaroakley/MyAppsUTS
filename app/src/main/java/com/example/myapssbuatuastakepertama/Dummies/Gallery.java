package com.example.myapssbuatuastakepertama.Dummies;

import com.example.myapssbuatuastakepertama.R;
import com.example.myapssbuatuastakepertama.Entity.gallery;

import java.util.ArrayList;

public class Gallery {
    private static int[] galleryItems ={

            R.drawable._10319_17,
            R.drawable._10319_39,
            R.drawable._10319_40,
            R.drawable._10319_41,
            R.drawable._10319_46,
            R.drawable.img_1053,
            R.drawable._91012_443

    };

    public static ArrayList<gallery> getListData(){
        ArrayList<gallery> list = new ArrayList<>();
        for (int position = 0; position < galleryItems.length; position++){
            gallery day = new gallery();
            day.setGalleryItems(galleryItems[position]);
            list.add(day);
        }
        return list;
    }
}
