package com.chinachino.rxjavaandrxandroid

import android.util.Log
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.Schedulers
import java.net.URL

class Simple {
    private val TAG=  "nimasss"
    var result  =""

    fun Run() : String{
        Observable.create<String> {
            val simpleurl= URL("https://jsonplaceholder.typicode.com/posts").readText()
            it.onNext(simpleurl)
        }.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    result =it
                    Log.d(TAG, "success: $it")
                },{
                    result = result
                    Log.d(TAG, "error: $it")
                })
        return result
    }
}