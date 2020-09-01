package com.chinachino.rxjavaandrxandroid;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "salammmm";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Simple simple = new Simple();
//        String result = simple.Run();
//        TextView text = findViewById(R.id.textview) ;
//        text.setText(result);
        AllUsers allUsers =new AllUsers();
        allUsers.getUserName().subscribe(new Observer<List<String>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                Log.d(TAG, "onSubscribe: "+ d.toString());
            }

            @Override
            public void onNext(@NonNull List<String> strings) {
                Log.d(TAG, "onNext: "+strings);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                Log.d(TAG, "onError: "+e.getMessage());
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "onComplete: complete");
            }
        });
    }
}