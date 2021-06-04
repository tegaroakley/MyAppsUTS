package com.example.myapssbuatuastakepertama;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapssbuatuastakepertama.Adapter.DailyAdapter;
import com.example.myapssbuatuastakepertama.Dummies.Daily;
import com.example.myapssbuatuastakepertama.Entity.daily;

import java.util.ArrayList;


public class SecondFragment extends Fragment {

    private RecyclerView dailyView;
    private ArrayList<daily> dailyList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        dailyView = view.findViewById(R.id.rv_daily);
        dailyView.setHasFixedSize(true);
        dailyList.addAll(Daily.getListData());
        ShowlistDaily();

        return view;
    }

    void ShowlistDaily(){
        dailyView.setLayoutManager(new LinearLayoutManager(getActivity()));
        DailyAdapter dailyAdapter = new DailyAdapter(dailyList);
        dailyView.setAdapter(dailyAdapter);
    }
}