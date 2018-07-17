package com.example.myassignment.myassigmnement.network;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by satheesh on 17,July,2018
 */
public class ApiClient {

    public static final String BASE_URL = "http://api.nytimes.com/svc/mostpopular/v2/";
    private static Retrofit retrofit = null;




    public static Retrofit getClient() {

        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
        clientBuilder.
                addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request();
                        Response response = chain.proceed(request);
                        return response;
                    }
                });

        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(clientBuilder.build())
                    .build();
        }
        return retrofit;
    }
}
