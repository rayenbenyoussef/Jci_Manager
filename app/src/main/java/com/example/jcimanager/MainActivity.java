package com.example.jcimanager;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
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
        replaceFrag(new NewsFragment());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            int id=item.getItemId();
            if(id==R.id.events){
                replaceFrag(new EventsFragment());
            }else if (id==R.id.profile) {
                replaceFrag(new ProfileFragment());
            }else if (id==R.id.news) {
                replaceFrag(new NewsFragment());
            }else if (id==R.id.manage) {
                replaceFrag(new ManageFragment());
            }else if (id==R.id.settings) {
                replaceFrag(new SettingsFragment());
            }

            return true;
        } );
    }

    private void replaceFrag(Fragment frag){
        FragmentManager fragManger=getSupportFragmentManager();
        FragmentTransaction fragTransaction=fragManger.beginTransaction();
        fragTransaction.replace(R.id.frame_lay,frag);
        fragTransaction.commit();
    }
}