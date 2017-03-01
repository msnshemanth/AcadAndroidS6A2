package com.example.hemanth.s6assign2_2;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Hemanth on 28-02-2017.
 */

public class Layout1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         return inflater.inflate(R.layout.layout1,container,false);


//        View view = inflater.inflate(R.layout.layout1,null);
//        return view;
    }


}
