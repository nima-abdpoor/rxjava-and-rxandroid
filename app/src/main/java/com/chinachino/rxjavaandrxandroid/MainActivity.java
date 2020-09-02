package com.chinachino.rxjavaandrxandroid;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import org.reactivestreams.Subscription;

import java.util.List;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "salammmm";
    CompositeDisposable disposable=new CompositeDisposable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Simple simple = new Simple();
//        String result = simple.Run();
//        TextView text = findViewById(R.id.textview) ;
//        text.setText(result);
        //User();
        //Timer();
        //Manager();
        //flow();
        operator();

    }

    private void operator() {
        Operators operators=new Operators();
        operators.run();
    }

    private void flow() {
        flowable flowable=new flowable();
        flowable.flow().subscribe(new FlowableSubscriber<Integer>() {
            @Override
            public void onSubscribe(@NonNull Subscription s) {
                Log.d(TAG, "onSubscribe: start");
            }

            @Override
            public void onNext(Integer integer) {
                Log.d(TAG, "onNext: "+integer);
            }

            @Override
            public void onError(Throwable t) {
                Log.d(TAG, "onError() returned: " + t);
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "onComplete: complete");
            }
        });
    }

    private void Manager() {
        Manage manage =new Manage();
        manage.run();
    }

    private void Timer() {
        timer timer = new timer();
        timer.run().subscribe(new Observer<Long>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                Log.d(TAG, "onSubscribe: start");
                disposable.add(d);
            }

            @Override
            public void onNext(@NonNull Long aLong) {
                Log.d(TAG, "onNext: "+ aLong);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                Log.e(TAG, "onError: ", e);
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "onComplete: complete");
            }
        });
    }

    private void User() {
        AllUsers allUsers =new AllUsers();
        allUsers.getUserName().subscribe(new Observer<List<String>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                Log.d(TAG, "onSubscribe: "+ d.toString());
                disposable.add(d);
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
                disposable.clear();
                Log.d(TAG, "onComplete: complete");
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        disposable.clear();
    }
}