package com.example.myassignment.myassigmnement.Model.modelinterface;

import com.example.myassignment.myassigmnement.Model.Result;
import com.example.myassignment.myassigmnement.network.ArticleResponse;

import java.util.List;

/**
 * Created by satheesh on 17,July,2018
 */
public interface IArticleInterface {

    void showMessage(String msg);

    void getArticleList(List<Result> lstResult);
    void showErrorMessage(String errprMsg);
}
