package com.chinachino.rxjavaandrxandroid.Requests;

import java.util.List;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RequestAPI {

    @GET("posts")
    Observable<List<Post>> getPosts();

    @GET("posts/{id}/comments")
    Observable<List<Comments>> getComments(@Path("id") String id);
}
