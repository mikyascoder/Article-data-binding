package com.mcs.mikyas.article;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mcs.mikyas.article.databinding.ArticleListItemBinding;

import java.util.List;

public class ArticleListAdapter extends RecyclerView.Adapter<ArticleListAdapter.MyViewHolder> {

    private List<Article> articleList;
    private LayoutInflater layoutInflater;


    public class MyViewHolder extends RecyclerView.ViewHolder {

        private final ArticleListItemBinding binding;

        public MyViewHolder(final ArticleListItemBinding itemBinding) {
            super(itemBinding.getRoot());
            this.binding = itemBinding;
        }
    }


    public ArticleListAdapter(List<Article> articleList) {
        this.articleList= articleList;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.getContext());
        }
        ArticleListItemBinding binding =
                DataBindingUtil.inflate(layoutInflater, R.layout.article_list_item, parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.binding.setArticle(articleList.get(position));


    }

    @Override
    public int getItemCount() {
        return articleList.size();
    }



}
