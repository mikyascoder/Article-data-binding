package com.mcs.mikyas.article;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.mcs.mikyas.article.databinding.ActivityMainBinding;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    private List<Article> dataset;
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
       // dataset = Mockfactory.getmockedarticles();
        API articleApi = Retrofitservice.getArticleClient().create(API.class);
        Call<List<Article>> call = articleApi.getArticles();
        String call_string = call.request().toString();
        Log.d("Articleretro", call_string);
        call.enqueue(new Callback<List<Article>>() {
            @Override
            public void onResponse(Call<List<Article>> call, Response<List<Article>> response) {

                Log.d("Articleretro", response.body().toString());
                //dat = response.body();
                datafeed(response.body());


            }

            @Override
            public void onFailure(Call<List<Article>> call, Throwable t) {
                call.cancel();
                Log.e("RETROFIT_ERROR",
                        "TODO handle error <" + t.getMessage() + "> <" + t.toString() + ">");
            }

        });

       // rv = findViewById(R.id.article_recycler_view);
       // LinearLayoutManager llm = new LinearLayoutManager(this);
      //  rv.setLayoutManager(llm);


    }
    public void datafeed(List<Article> artlist){
        dataset=artlist;
        rv=binding.articleRecyclerView;
        rv.setLayoutManager(new LinearLayoutManager(this));
        ArticleListAdapter adapter = new ArticleListAdapter(dataset);
        rv.setAdapter(adapter);
    }
}
