package com.dioses.dailypulse.articles.application

import com.dioses.dailypulse.articles.data.SourceRaw
import com.dioses.dailypulse.articles.data.SourceRepository

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.articles.application
 * Created by Arthur Dioses Reto on 25/03/24 at 10:14 AM
 * All rights reserved 2024.
 ****/
class SourceUseCase(private val repo: SourceRepository) {

    suspend fun getSources(): List<Source> {
        val sourcesRaw = repo.getSources()
        return mapSources(sourcesRaw)
    }

    private fun mapSources(sourcesRaw: List<SourceRaw>): List<Source> = sourcesRaw.map { raw ->
        Source(
            raw.id,
            raw.name,
            raw.desc,
            mapOrigin(raw)
        )
    }

    private fun mapOrigin(raw: SourceRaw) = "${raw.country} - ${raw.language}"

}