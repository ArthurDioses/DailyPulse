package com.dioses.dailypulse.articles.data

import dioses.dailypulse.db.DailyPulseDatabase

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.articles.data
 * Created by Arthur Dioses Reto on 25/03/24 at 10:34 AM
 * All rights reserved 2024.
 ****/
class SourceDatabaseSource(private val database: DailyPulseDatabase) {

    fun getAllSources(): List<SourceRaw> =
        database.dailyPulseDatabaseQueries.selectAllSources(::mapToSourceRaw).executeAsList()

    fun insertSources(sources: List<SourceRaw>) {
        database.dailyPulseDatabaseQueries.transaction {
            sources.forEach { source ->
                insertSources(source)
            }
        }
    }

    fun clearSources() =
        database.dailyPulseDatabaseQueries.removeAllSources()

    private fun insertSources(sourceRaw: SourceRaw) {
        database.dailyPulseDatabaseQueries.insertSource(
            sourceRaw.id,
            sourceRaw.name,
            sourceRaw.desc,
            sourceRaw.language,
            sourceRaw.country
        )
    }

    private fun mapToSourceRaw(
        id: String,
        name: String,
        desc: String,
        language: String,
        country: String,
    ): SourceRaw = SourceRaw(
        id, name, desc, language, country
    )

}