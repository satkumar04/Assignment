package com.example.myassignment.myassigmnement.Controller;

import com.example.myassignment.myassigmnement.Model.ArticleModel;
import com.example.myassignment.myassigmnement.Model.modelinterface.IArticleInterface;

/**
 * Created by satheesh on 17,July,2018
 */
public class ArticleController {

    ArticleModel articleModel ;


    public ArticleController(IArticleInterface iArticleInterface)
    {
        articleModel = new ArticleModel(iArticleInterface);
    }

    public void getArticles(String key)
    {
        articleModel.getArticles(key);
    }
}
