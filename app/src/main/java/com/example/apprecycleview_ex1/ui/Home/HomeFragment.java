package com.example.apprecycleview_ex1.ui.Home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apprecycleview_ex1.MyAdapter;
import com.example.apprecycleview_ex1.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    RecyclerView recyclerView;
    int[] mPlaceList;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = (RecyclerView)root.findViewById(R.id.recycleview_home);

        GridLayoutManager gridLayoutManager =new GridLayoutManager((getContext()),2);
        recyclerView.setLayoutManager(gridLayoutManager);

        mPlaceList =new int[]{R.drawable.hinh1,R.drawable.hinh2,R.drawable.hinh3,R.drawable.hinh4,R.drawable.hinh5,
                R.drawable.hinh6,R.drawable.hinh7,R.drawable.hinh8,R.drawable.hinh9,
                R.drawable.hih10,R.drawable.hinh11,R.drawable.hinh12,R.drawable.hinh13,R.drawable.hinh14,
                R.drawable.hinh15,R.drawable.hinh16,R.drawable.hinh17,R.drawable.hinh18,R.drawable.hinh19,
                R.drawable.hinh20,R.drawable.hinh21,R.drawable.hinh22,R.drawable.hinh23,R.drawable.hinh24,
                R.drawable.hinh25,R.drawable.hinh26,R.drawable.hinh27,R.drawable.hinh28,R.drawable.hinh29,
                R.drawable.hinh30,R.drawable.hinh31,R.drawable.hinh32,R.drawable.hinh33,R.drawable.hinh34,
                R.drawable.hinh35,R.drawable.hinh36,R.drawable.hinh37,R.drawable.hinh38,R.drawable.hinh39,
                R.drawable.hinh40,R.drawable.hinh41,R.drawable.hinh42,R.drawable.hinh43,R.drawable.hinh44,
                R.drawable.hinh45,R.drawable.hinh46,R.drawable.hinh47,R.drawable.hinh48,R.drawable.hinh49,
                R.drawable.hinh50};

        MyAdapter adapter =new MyAdapter(getContext(),mPlaceList);
        recyclerView.setAdapter(adapter);
           return root;
    }
}