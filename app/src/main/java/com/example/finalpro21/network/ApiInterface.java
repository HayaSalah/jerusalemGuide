package com.example.finalpro21.network;

import com.example.finalpro21.model.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    //  https://newsapi.org/v2/everything?q=%D8%A7%D9%84%D9%82%D8%AF%D8%B3&from=2021-05-08&to=2021-05-08&sortBy=popularity&apiKey=a8f62f7bc7f84af7b64af921614be2ae


    @GET("everything")
    Call<News> getRecent(@Query("q") String q,
                         @Query("from") String from,
                         @Query("to") String to,
                         @Query("sortBy") String sortBy,
                         @Query("apiKey") String apiKey,
                         @Query("language") String language);

}
