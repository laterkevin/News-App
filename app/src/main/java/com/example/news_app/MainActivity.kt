package com.example.news_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.news_app.R
import com.example.news_app.adapter.NewsAdapter
import com.example.news_app.databinding.ActivityMainBinding
import com.example.news_app.data.Repository

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val repository = Repository()

        val newsList = repository.loadNews()

        binding.newsRecycler.adapter = NewsAdapter(newsList)


//        val snapHelper: SnapHelper = PagerSnapHelper()
//        snapHelper.attachToRecyclerView(binding.newsRecycler)
    }
}
