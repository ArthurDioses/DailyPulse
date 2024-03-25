package com.dioses.dailypulse.articles.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.articles
 * Created by Arthur Dioses Reto on 21/03/24 at 10:37 PM
 * All rights reserved 2024.
 ****/

@Serializable
data class ArticlesResponse(
    @SerialName("status") val status: String,
    @SerialName("totalResults") val results: Int,
    @SerialName("articles") val articles: List<ArticleRaw>,
)