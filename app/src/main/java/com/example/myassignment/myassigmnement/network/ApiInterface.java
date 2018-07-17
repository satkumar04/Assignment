package com.example.myassignment.myassigmnement.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by satheesh on 17,July,2018
 */
public interface ApiInterface {

    @GET("mostviewed/all-sections/7.json")
    Call<ArticleResponse> getMostViewed(@Query("api-key") String apiKey);
}
