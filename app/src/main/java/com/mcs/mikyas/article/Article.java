package com.mcs.mikyas.article;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Article {



    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("article_date")
    @Expose
    private String articleDate;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;



    @SerializedName("external_url")
    @Expose
    private String externalUrl;





    public String getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    @Override
    public String toString() {
        return "Article{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", articleDate='" + articleDate + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", externalUrl='" + externalUrl + '\'' +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public String getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(String articleDate) {
        this.articleDate = articleDate;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }


    public Article(String author, String title, String articleDate, String thumbnail, String externalUrl) {
        this.author = author;
        this.title = title;
        this.articleDate = articleDate;
        this.thumbnail = thumbnail;
        this.externalUrl = externalUrl;
    }

    @BindingAdapter({"android:profileImage"})
    public static void loadImage(ImageView view, String imageUrl) {
        Glide.with(view.getContext())
                .load(imageUrl)
                .into(view);


    }









}
