package com.dioses.dailypulse.articles.presentation

import com.dioses.dailypulse.articles.application.Article

data class ArticlesState(
    val articles: List<Article> = listOf(),
    val loading: Boolean = false,
    val error: String? = null,
)