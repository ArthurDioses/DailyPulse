package com.dioses.dailypulse.articles

import dioses.dailypulse.db.DailyPulseDatabase

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.articles
 * Created by Arthur Dioses Reto on 24/03/24 at 7:47 PM
 * All rights reserved 2024.
 ****/

class ArticlesDatabaseSource(private val database: DailyPulseDatabase) {

    fun getAllArticles(): List<ArticleRaw> =
        database.dailyPulseDatabaseQueries.selectAllArticles(::mapToArticleRaw).executeAsList()

    private fun mapToArticleRaw(
        title: String,
        desc: String?,
        data: String,
        url: String?,
    ): ArticleRaw = ArticleRaw(
        title, desc, data, url
    )
}