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
 * Use the {@link LoginFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LoginFragment extends Fragment {

    public LoginFragment() {
        // Required empty public constructor
    }

    public static LoginFragment newInstance(String param1, String param2) {
        LoginFragment fragment = new LoginFragment();

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
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView signupButton=view.findViewById(R.id.signup_button);
        TextView forgotButton=view.findViewById(R.id.forgot_button);
        TextView visitorButton=view.findViewById(R.id.visitor_button);
        Button done=view.findViewById(R.id.login_button);
        EditText email=view.findViewById(R.id.log_email);
        EditText password=view.findViewById(R.id.log_pass);

        signupButton.setOnClickListener(v -> {
            ((MainActivity) requireActivity()).replaceFrag(new SignupFragment());
        });
        forgotButton.setOnClickListener(v -> {
            if(!DataController.isEmpty(email)) {
                Snackbar snackbar = Snackbar.make(view, "A mail has been sent to that email containing the new password", Snackbar.LENGTH_INDEFINITE);
                snackbar.setBackgroundTint(Color.YELLOW); // warning color
                snackbar.setTextColor(Color.BLACK);
                snackbar.setAction("Dismiss", s -> snackbar.dismiss()); // optional
                snackbar.show();
            }else {
                Toast.makeText(getContext(),"please enter an email",Toast.LENGTH_LONG).show();
            }
        });
        done.setOnClickListener(v -> {
            if(!(DataController.isEmpty(email)||DataController.isEmpty(password))) {
                ((MainActivity) requireActivity()).replaceFrag(new HomePageFragment(new ProfileFragment()));
                return;
            }else {
                Toast.makeText(getContext(),"please enter missing data",Toast.LENGTH_LONG).show();
            }
        });

        visitorButton.setOnClickListener(v -> {
            ((MainActivity) requireActivity()).replaceFrag(new HomePageFragment(new NewsFragment()));
        });
    }

}