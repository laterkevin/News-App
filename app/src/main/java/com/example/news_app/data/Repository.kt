package com.example.news_app.data

import com.example.news_app.R
import com.example.news_app.data.model.NewsArticle

class Repository {

    fun loadNews(): List<NewsArticle> {

        return listOf(
            NewsArticle(
                "Job-Sicherheit in Deutschland!",
                R.drawable.jobs,
                "Deutschland",
                "01.08.2022"
            ),
            NewsArticle(
                "Winter's coming…",
                R.drawable.gas,
                "Welt",
                "22.04.2022"
            ),
            NewsArticle(
                "Urlaub in der sächsischen Schweiz hat fast geklappt...",
                R.drawable.brand,
                "Sachsen",
                "17.02.2022"
            ),
            NewsArticle(
                "Scheiß auf Photosynthese!",
                R.drawable.baum,
                "Afrika",
                "10.01.2022"
            ),
            NewsArticle(
                "Die Arche Noah wird dieses Mal sehr übersichtlich!",
                R.drawable.animal,
                "USA",
                "09.06.2022"
            )
        )
    }
}
