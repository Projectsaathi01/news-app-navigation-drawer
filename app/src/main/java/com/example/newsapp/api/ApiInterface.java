package com.example.newsapp.api;

import com.example.newsapp.models.Article;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("api/agriculture")
    Call<List<Article>> getArticles();

}
