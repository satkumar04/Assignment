package com.example.myassignment.myassigmnement;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.myassignment.myassigmnement.Controller.ArticleController;
import com.example.myassignment.myassigmnement.Model.Result;
import com.example.myassignment.myassigmnement.Model.modelinterface.IArticleInterface;
import com.example.myassignment.myassigmnement.view.ArticleAdapter;

import java.util.List;

/**
 * Created by satheesh on 17,July,2018
 */
public class MainActivity extends AppCompatActivity implements IArticleInterface{

    // TODO - insert your themoviedb.org API KEY here
    private final static String API_KEY = "5637c9ef86c54e00ab0ed504b0045302";
    private ArticleController articleController;
    private static final String TAG = ArticleController.class.getSimpleName();
    private RecyclerView recyclerView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        articleController = new ArticleController(this);
        articleController.getArticles(API_KEY);

        recyclerView = (RecyclerView) findViewById(R.id.article_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public void getArticleList(List<Result> lstResult) {
        recyclerView.setAdapter(new ArticleAdapter(lstResult, R.layout.row_item, getApplicationContext()));
    }

    @Override
    public void showErrorMessage(String errprMsg) {
        Toast.makeText(getApplicationContext(), errprMsg, Toast.LENGTH_LONG).show();
    }
}
