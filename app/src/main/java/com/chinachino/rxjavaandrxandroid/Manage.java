package com.chinachino.rxjavaandrxandroid;

import android.util.Log;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class Manage {
    private final String TAG = "ObservableTask";
    private final String TAG2 = "testFilter";

    public void run() {
        Observable<Task> taskObservable = Observable
                .fromIterable(DataSource.CreateTasksList())
                .subscribeOn(Schedulers.io())
                .filter(task -> {
                    Log.d(TAG2, "test: " + Thread.currentThread().getName());
                    return task.isComplete();
                })
                .observeOn(AndroidSchedulers.mainThread());

        taskObservable.subscribe(new Observer<Task>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                Log.d(TAG, "onSubscribe: called");
            }

            @Override
            public void onNext(@NonNull Task task) {
                Log.d(TAG, "onNext: " + Thread.currentThread().getName());
                Log.d(TAG, "onNext: " + task.getDescription());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onError(@NonNull Throwable e) {
                Log.e(TAG, "onError: ", e);
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "onComplete: completed");
            }
        });
    }
}
