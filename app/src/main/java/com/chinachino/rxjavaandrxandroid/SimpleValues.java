package com.chinachino.rxjavaandrxandroid;

import android.util.Log;

import io.reactivex.rxjava3.subjects.BehaviorSubject;

public class SimpleValues {
    private static final String TAG = "simpleValues";

    public void simple(){

        BehaviorSubject behaviorSubject = BehaviorSubject.createDefault(2);
        Integer value = (Integer) behaviorSubject.getValue();
        Log.d(TAG, "simple: "+value);
    }
}
