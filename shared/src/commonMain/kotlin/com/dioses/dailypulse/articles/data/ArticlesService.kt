package com.dioses.dailypulse.articles.data

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.articles
 * Created by Arthur Dioses Reto on 21/03/24 at 11:19 PM
 * All rights reserved 2024.
 ****/
class ArticlesService(private val httpClient: HttpClient) {
    private val country = "us"
    private val category = "business"
    private val apiKey = "13ad2e30721d4d4d8345f8d6c4805c61"

    suspend fun fetchArticles(): List<ArticleRaw> {
        val response: ArticlesResponse =
            httpClient.get("https://newsapi.org/v2/top-headlines?country=$country&category=$category&apiKey=$apiKey")
                .body()

        return response.articles
    }
}