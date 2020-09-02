package com.chinachino.rxjavaandrxandroid

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.schedulers.Schedulers

class Operators {
    fun run() =
        Observable
                .just(1,2,3,4,2,3)
                .distinct()
                .skip(2)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())

}