package com.example.myassignment.myassigmnement.view;

import android.content.Context;
import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.myassignment.myassigmnement.Model.Result;
import com.example.myassignment.myassigmnement.R;

import java.util.List;

/**
 * Created by satheesh on 17,July,2018
 */
public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder> {
    private List<Result> articles;
    private int rowLayout;
    private Context mContext;

    public ArticleAdapter(List<Result> articles, int rowLayout, Context context) {
        this.rowLayout = rowLayout;
        this.articles = articles;
        this.mContext = context;
    }

    @Override
    public ArticleAdapter.ArticleViewHolder onCreateViewHolder(ViewGroup parent,
                                                               int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new ArticleViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ArticleViewHolder holder, final int position) {
        holder.publishDateTV.setText(articles.get(position).getPublishedDate());
        holder.titleTV.setText(articles.get(position).getTitle());
        holder.typeTV.setText(articles.get(position).getType());
        holder.authorTV.setText(articles.get(position).getByline());
        ImageView imageView = holder.imageView;
        String url = articles.get(position).getUrl();
        Log.e("URL",url);
        //if there any valid image url then image will display here.

        if (url != null) {

            Glide.with(mContext)
                    .load(url)
                    .placeholder(R.drawable.ic_curved_rect).skipMemoryCache(true)
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .into(imageView);

        }


    }

    @Override
    public int getItemCount() {
        return articles.size();
    }


    public static class ArticleViewHolder extends RecyclerView.ViewHolder {

        TextView publishDateTV;
        TextView titleTV;
        TextView typeTV;
        TextView authorTV;
        ImageView imageView;


        public ArticleViewHolder(View v) {
            super(v);
            imageView = (ImageView) v.findViewById(R.id.imageView);
            publishDateTV = (TextView) v.findViewById(R.id.publishDateTV);
            titleTV = (TextView) v.findViewById(R.id.title);
            typeTV = (TextView) v.findViewById(R.id.typeTV);
            authorTV = (TextView) v.findViewById(R.id.authorTV);

        }
    }
}
