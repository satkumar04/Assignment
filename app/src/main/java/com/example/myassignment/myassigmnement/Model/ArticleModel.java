package com.example.myassignment.myassigmnement.Model;

import android.graphics.Movie;
import android.util.Log;

import com.example.myassignment.myassigmnement.Model.modelinterface.IArticleInterface;
import com.example.myassignment.myassigmnement.network.ApiClient;
import com.example.myassignment.myassigmnement.network.ApiInterface;
import com.example.myassignment.myassigmnement.network.ArticleResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.support.constraint.Constraints.TAG;

/**
 * Created by satheesh on 17,July,2018
 */
public class ArticleModel {

    IArticleInterface iArticleInterface;

    public ArticleModel(IArticleInterface iArticleInterface)
    {
        this.iArticleInterface=iArticleInterface;
    }

    public void getArticles(String key)
    {

        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<ArticleResponse> call = apiService.getMostViewed(key);
        call.enqueue(new Callback<ArticleResponse>() {
            @Override
            public void onResponse(Call<ArticleResponse>call, Response<ArticleResponse> response) {
                List<Result> lstArticle = response.body().getResults();
                Log.d(TAG, "Number of articles received: " + lstArticle.size());
                iArticleInterface.getArticleList(lstArticle);
            }

            @Override
            public void onFailure(Call<ArticleResponse>call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
                iArticleInterface.showErrorMessage(t.getMessage());
            }
        });
    }
}
