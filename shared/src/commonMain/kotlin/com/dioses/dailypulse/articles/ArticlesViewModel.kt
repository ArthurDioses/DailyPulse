package com.dioses.dailypulse.articles

import com.dioses.dailypulse.BaseViewModel
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.aticles
 * Created by Arthur Dioses Reto on 20/03/24 at 1:05 PM
 * All rights reserved 2024.
 ****/
class ArticlesViewModel(
    private val useCase: ArticlesUseCase,
) : BaseViewModel() {
    private val _articlesState: MutableStateFlow<ArticlesState> =
        MutableStateFlow(ArticlesState(loading = true))

    val articlesState: StateFlow<ArticlesState> get() = _articlesState

    init {
        getArticles()
    }

    fun getArticles(forceFetch: Boolean = false) {
        scope.launch {
            val fetchedArticles = useCase.getArticles(forceFetch)

            _articlesState.emit(ArticlesState(articles = fetchedArticles))
        }
    }
}