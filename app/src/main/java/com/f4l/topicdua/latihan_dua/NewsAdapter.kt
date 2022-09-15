package com.f4l.topicdua.latihan_dua

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.f4l.topicdua.R
import com.f4l.topicdua.databinding.ItemNewsBinding

class NewsAdapter(var news : ArrayList<DataNews>) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {
    class NewsViewHolder(val binding : ItemNewsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(itemNewsBinding: DataNews){
            binding.listNews = itemNewsBinding
            binding.btnCard.setOnClickListener {
                var bundle = Bundle()
                bundle.putSerializable("data_news", itemNewsBinding)

                Navigation.findNavController(itemView).navigate(R.id.action_newsFragment_to_detailFragment, bundle)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
       var view = ItemNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
       holder.bind(news[position])
    }

    override fun getItemCount(): Int {
        return news.size
    }
}