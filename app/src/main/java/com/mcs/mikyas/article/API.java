package com.mcs.mikyas.article;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface API {
    public static final String BASE_URL="http://ufc-data-api.ufc.com";
    public static final String FEED="/api/v3/iphone/news/";

    //@GET("EMPIRE")
    @GET(FEED)
    Call<List<Article>> getArticles();



}
