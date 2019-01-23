package com.example.example01library;

import android.content.Context;
import android.widget.Toast;

public class Example01Message {
    public static void s(Context c, String message){
        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();
    }
}