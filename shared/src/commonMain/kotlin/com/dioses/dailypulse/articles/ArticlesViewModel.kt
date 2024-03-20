package com.dioses.dailypulse.articles

import com.dioses.dailypulse.BaseViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.aticles
 * Created by Arthur Dioses Reto on 20/03/24 at 1:05 PM
 * All rights reserved 2024.
 ****/
class ArticlesViewModel : BaseViewModel() {
    private val _articlesState: MutableStateFlow<ArticlesState> =
        MutableStateFlow(ArticlesState(loading = true))

    val articlesState: StateFlow<ArticlesState> get() = _articlesState

    init {
        getArticles()
    }

    private fun getArticles() {
        scope.launch {
            delay(2000)

            _articlesState.emit(ArticlesState(error = "Something went wrong"))

            delay(2000)

            val fetchedArticles = fetchArticles()

            _articlesState.emit(ArticlesState(articles = fetchedArticles))
        }
    }

    suspend fun fetchArticles(): List<Article> = mockArticles

    private val mockArticles = listOf(
        Article(
            "Stock market today: Live updates CNBC",
            "Futures were higher in premarket trading as Wall Street tried to regain its footing.",
            "2023-11-69",
            "https://image.cnbcfm.com/api/v1/image/107326078-1698758530118-gettyimages-1765623456-wall26362_igj6ehhp.jpg"
        ), Article(
            "Best iPhone Deals (2023): Carrier Deals, Unlocked iPhones",
            "Apple's smartphones rarely go on sale, but if you're looking to upgrade (or you're gift shopping), here are a qeecaaeman bs",
            "2023-11-09",
            "https://media.wired.com/photos/622aa5c8cca6acf55fb70b57/191:100/w_1280,c_limit/iPhone-13-Pro-Colors-SOURCE.jpg"
        ), Article(
            "Samsung details 'Galaxy AI' and a feature that can translate phone calls in real time",
            "n a new blog post, Samsung previewed what it calls a new era of Galaxy AI coming to its smartphones and de asas2sas",
            "2023-11-69",
            "https://images.indianexpress.com/2024/01/galaxy-ai-featured.jpg"
        )
    )
}