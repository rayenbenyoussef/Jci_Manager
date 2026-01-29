package com.example.jcimanager;

import android.widget.EditText;

public class DataController {
    public static boolean isEmpty(EditText editText){
        String text = editText.getText().toString().trim();
        if(text.isEmpty()){
            editText.setError("cannot be empty!");
            return true;
        }
        return false;
    }
}
