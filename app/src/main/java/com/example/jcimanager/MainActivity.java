package com.example.jcimanager;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.example.jcimanager.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());
        replaceFrag(new HomeFragment());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            int id=item.getItemId();
            if(id==R.id.home){
                replaceFrag(new HomeFragment());
            } else if (id==R.id.events) {
                replaceFrag(new eventsFragment());
            }else if (id==R.id.news) {
                replaceFrag(new newsFragment());
            }

            return true;
        } );


        DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(v -> {
            drawerLayout.openDrawer(GravityCompat.START);
        });
    }

    private void replaceFrag(Fragment frag){
        FragmentManager fragManger=getSupportFragmentManager();
        FragmentTransaction fragTransaction=fragManger.beginTransaction();
        fragTransaction.replace(R.id.frame_lay,frag);
        fragTransaction.commit();
    }
}