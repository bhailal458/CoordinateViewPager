package com.example.sparken02.coordinateviewpager;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sparken02 on 20/6/17.
 */

public class FragmentAndroid extends Fragment {

    private String title;
    private int page;
    public static FragmentAndroid newInstance(int page) {
        FragmentAndroid frgmAndroid = new FragmentAndroid();

        return frgmAndroid;
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_android,container,false);
        return view;

    }
}
