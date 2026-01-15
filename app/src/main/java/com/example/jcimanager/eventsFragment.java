package com.example.jcimanager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.time.LocalDate;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link eventsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class eventsFragment extends Fragment {

    public eventsFragment() {
        // Required empty public constructor
    }

    public static eventsFragment newInstance() {
        eventsFragment fragment = new eventsFragment();
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
        return inflater.inflate(R.layout.fragment_events, container, false);
    }
}