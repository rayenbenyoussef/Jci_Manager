package com.example.jcimanager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetailedEventFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailedEventFragment extends Fragment {

    public DetailedEventFragment() {
        // Required empty public constructor
    }

    public static DetailedEventFragment newInstance(String param1, String param2) {
        DetailedEventFragment fragment = new DetailedEventFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detailed_event, container, false);
    }
}