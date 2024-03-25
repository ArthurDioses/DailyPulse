package com.dioses.dailypulse.articles.data

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.articles.data
 * Created by Arthur Dioses Reto on 25/03/24 at 10:39 AM
 * All rights reserved 2024.
 ****/
class SourceRepository(
    private val dataSource: SourceDatabaseSource,
    private val service: SourcesService,
) {
    suspend fun getSources(): List<SourceRaw> {
        val sourceDb = dataSource.getAllSources()
        if (sourceDb.isEmpty()) {
            dataSource.clearSources()
            val fetchedSources = service.fetchSources()
            dataSource.insertSources(fetchedSources)
            return fetchedSources
        }
        return sourceDb
    }
}