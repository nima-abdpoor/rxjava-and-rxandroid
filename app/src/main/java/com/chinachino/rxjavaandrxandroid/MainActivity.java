package com.chinachino.rxjavaandrxandroid;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Simple simple = new Simple();
        String result = simple.Run();
        TextView text = findViewById(R.id.textview) ;
        text.setText(result);
    }
}