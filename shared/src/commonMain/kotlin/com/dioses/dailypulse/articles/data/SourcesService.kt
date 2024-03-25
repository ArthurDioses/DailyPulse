package com.dioses.dailypulse.articles.data

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.articles.data
 * Created by Arthur Dioses Reto on 25/03/24 at 10:40 AM
 * All rights reserved 2024.
 ****/
class SourcesService(private val httpClient: HttpClient) {
    private val apiKey = "13ad2e30721d4d4d8345f8d6c4805c61"

    suspend fun fetchSources(): List<SourceRaw> {
        val response: SourceResponse =
            httpClient.get("https://newsapi.org/v2/top-headlines/sources?apiKey=$apiKey")
                .body()
        return response.sources
    }
}