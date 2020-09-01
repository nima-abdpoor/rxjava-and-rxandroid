package com.chinachino.rxjavaandrxandroid

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observable.create
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.schedulers.Schedulers

class AllUsers {
    val list  = listOf<String>("nima","maryam")
    fun getUserName() : Observable<List<String>>{
         return Observable.create<List<String>>(){
             it.onNext(list)
         }.subscribeOn(Schedulers.io())
                 .observeOn(AndroidSchedulers.mainThread())
    }
}