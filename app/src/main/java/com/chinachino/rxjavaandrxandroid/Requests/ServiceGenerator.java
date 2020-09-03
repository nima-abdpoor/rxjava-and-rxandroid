package com.chinachino.rxjavaandrxandroid.Requests;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {
    private static String BaseURL = "https://jsonplaceholder.typecode.com/";
    static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(BaseURL)
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create());
    static RequestAPI requestAPI = builder.build().create(RequestAPI.class);
    public static RequestAPI getRequestAPI(){
        return requestAPI;
    }
}
