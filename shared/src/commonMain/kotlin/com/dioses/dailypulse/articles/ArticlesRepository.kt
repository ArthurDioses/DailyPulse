package com.dioses.dailypulse.articles

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.articles
 * Created by Arthur Dioses Reto on 24/03/24 at 8:16 PM
 * All rights reserved 2024.
 ****/
class ArticlesRepository(
    private val dataSource: ArticlesDatabaseSource,
    private val service: ArticlesService,
) {
    suspend fun getArticles(): List<ArticleRaw> {
        val articlesDb = dataSource.getAllArticles()
        println("Got ${articlesDb.size} from the database!!")

        if (articlesDb.isEmpty()) {
            val fetchedArticles = service.fetchArticles()
            dataSource.insertArticles(fetchedArticles)
            return fetchedArticles
        }
        return articlesDb
    }
}