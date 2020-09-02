package com.chinachino.rxjavaandrxandroid

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.functions.Predicate
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.TimeUnit

class timer {
    open fun run(): Observable<Long>? {
        return Observable.interval(1, TimeUnit.SECONDS)
                .filter { it<10 }
                .map { it*10 }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }
}