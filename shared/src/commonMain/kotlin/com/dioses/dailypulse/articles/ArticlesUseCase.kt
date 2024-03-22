package com.dioses.dailypulse.articles

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.articles
 * Created by Arthur Dioses Reto on 21/03/24 at 11:30 PM
 * All rights reserved 2024.
 ****/
class ArticlesUseCase(private val service: ArticlesService) {
    suspend fun getArticles(): List<Article> {
        val articlesRaw = service.fetchArticles()

        return mapArticles(articlesRaw)
    }

    private fun mapArticles(articlesRaw: List<ArticleRaw>): List<Article> = articlesRaw.map { raw ->
        Article(
            raw.title,
            raw.desc ?: "Click to find out more",
            raw.date,
            raw.imageUrl
                ?: "https://image.cnbcfm.com/api/v1/image/107326078-1698758530118-gettyimages-1765623456-wall26362_igj6chhp.jpeg?v=1698758587&w=1920&h=1080"
        )
    }
}