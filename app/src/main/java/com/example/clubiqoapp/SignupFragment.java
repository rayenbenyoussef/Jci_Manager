package com.example.clubiqoapp;

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
            if(fullname.getText().toString().trim().isEmpty()||
                    nid.getText().toString().trim().isEmpty()||
                    email.getText().toString().trim().isEmpty()||
                    phonenum.getText().toString().trim().isEmpty()||
                    birth.getText().toString().trim().isEmpty()) {

                Snackbar.make(v,"Please enter the missing informations.", Snackbar.LENGTH_LONG)
                        .show();

            }else if(DataController.signup(fullname.getText().toString(),
                    nid.getText().toString(),
                    email.getText().toString(),
                    phonenum.getText().toString(),
                    birth.getText().toString())){

                Snackbar.make(view, "Password has been sent to your email. you can login now", Snackbar.LENGTH_INDEFINITE)
                        .setBackgroundTint(Color.YELLOW)
                        .setTextColor(Color.BLACK)
                        .setAction("Dismiss", s -> {})
                        .show();

            }else{
                Snackbar.make(v,"Something went wrong, please check your informations.", Snackbar.LENGTH_LONG)
                        .show();
            }
        });


    }
}