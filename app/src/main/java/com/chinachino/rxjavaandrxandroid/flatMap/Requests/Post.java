package com.chinachino.rxjavaandrxandroid.flatMap.Requests;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Post {
    private int userId;
    private Integer id;
    private String title;
    @SerializedName("body")
    private String body;
    private List<Comments> comments;

    public Post(int userId, Integer id, String title, String body,List<Comments> comments) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
        this.comments=comments;
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Post{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
