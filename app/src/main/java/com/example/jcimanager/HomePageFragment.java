package com.example.jcimanager;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomePageFragment extends Fragment {
    Fragment startFrag;

    public HomePageFragment(Fragment startFrag) {
        // Required empty public constructor
        this.startFrag=startFrag;
    }

    public static HomePageFragment newInstance() {
        HomePageFragment fragment = new HomePageFragment(new NewsFragment());
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
        return inflater.inflate(R.layout.fragment_home_page, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getParentFragmentManager()   // or getSupportFragmentManager() if in Activity
                .beginTransaction()
                .replace(R.id.home_frame_lay, startFrag)
                .commit();
        BottomNavigationView bottomNavigationView = view.findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id=item.getItemId();
            Fragment selectedFragment=null;
            if(id==R.id.events){
                selectedFragment=new EventsFragment();
            }else if (id==R.id.profile) {
                selectedFragment=new ProfileFragment();
            }else if (id==R.id.news) {
                selectedFragment=new NewsFragment();
            }else if (id==R.id.manage) {
                selectedFragment=new ManageFragment();
            }else if (id==R.id.settings) {
                selectedFragment=new SettingsFragment();
            }
            if (selectedFragment != null) {
                // Perform the fragment transaction
                getParentFragmentManager()   // or getSupportFragmentManager() if in Activity
                        .beginTransaction()
                        .replace(R.id.home_frame_lay, selectedFragment)
                        .addToBackStack(null)
                        .commit();
            }
            return true;
        } );
    }
}