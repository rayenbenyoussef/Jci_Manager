package com.example.jcimanager;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SignupFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SignupFragment extends Fragment {

    public SignupFragment() {
        // Required empty public constructor
    }

    public static SignupFragment newInstance(String param1, String param2) {
        SignupFragment fragment = new SignupFragment();
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
        return inflater.inflate(R.layout.fragment_signup, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView loginButton=view.findViewById(R.id.log_button);
        Button done=view.findViewById(R.id.sign_button);

        EditText email=view.findViewById(R.id.sign_email);
        EditText fullname=view.findViewById(R.id.sign_fullname);
        EditText nid=view.findViewById(R.id.sign_nid);
        EditText birth=view.findViewById(R.id.sign_birth);
        EditText phonenum=view.findViewById(R.id.sign_phonenum);

        loginButton.setOnClickListener(v -> {
            ((MainActivity) requireActivity()).replaceFrag(new LoginFragment());
        });
        done.setOnClickListener(v -> {
            if(DataController.isEmpty(fullname)|| DataController.isEmpty(nid)||DataController.isEmpty(email)|| DataController.isEmpty(phonenum)|| DataController.isEmpty(birth) ) {
                Toast.makeText(getContext(),"please enter the missing data",Toast.LENGTH_LONG).show();
            }else {
                Snackbar snackbar = Snackbar.make(view, "password has been sent to your email. you can login now", Snackbar.LENGTH_INDEFINITE);
                snackbar.setBackgroundTint(Color.YELLOW); // warning color
                snackbar.setTextColor(Color.BLACK);
                snackbar.setAction("Dismiss", s -> snackbar.dismiss()); // optional
                snackbar.show();
            }
        });


    }
}