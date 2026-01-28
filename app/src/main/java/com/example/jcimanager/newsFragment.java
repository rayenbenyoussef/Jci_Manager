package com.example.jcimanager;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NewsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NewsFragment extends Fragment {
    public NewsFragment() {
        // Required empty public constructor
    }
    public static NewsFragment newInstance() {
        NewsFragment fragment = new NewsFragment();
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
        return inflater.inflate(R.layout.fragment_news, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView rv=view.findViewById(R.id.news_recycler_view);
        ArrayList<News> newsList = new ArrayList<>();

        newsList.add(new News(
                1,
                "The city announced new development plans for the downtown area.",
                R.drawable.news1,
                "City Development Update"
        ));

        newsList.add(new News(
                2,
                "Android 15 introduces performance improvements and new privacy features.",
                R.drawable.news2,
                "Android 15 Released"
        ));

        newsList.add(new News(
                3,
                "Local football team wins the championship after a dramatic final.",
                R.drawable.news3,
                "Championship Victory"
        ));

        newsList.add(new News(
                4,
                "Weather experts predict a hotter-than-usual summer this year.",
                R.drawable.news4,
                "Summer Heat Alert"
        ));

        newsList.add(new News(
                5,
                "Community clean-up event scheduled for this weekend.",
                R.drawable.news5,
                "Community Event"
        ));
        NewsAdapter adapter=new NewsAdapter(newsList);
        RecyclerView.LayoutManager rv_manager=new LinearLayoutManager(getContext());

        rv.setHasFixedSize(true);
        rv.setLayoutManager(rv_manager);
        rv.setAdapter(adapter);
    }
}