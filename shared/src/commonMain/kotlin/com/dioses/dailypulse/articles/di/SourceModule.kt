package com.dioses.dailypulse.articles.di

import com.dioses.dailypulse.articles.application.SourceUseCase
import com.dioses.dailypulse.articles.data.SourceDatabaseSource
import com.dioses.dailypulse.articles.data.SourceRepository
import com.dioses.dailypulse.articles.data.SourcesService
import com.dioses.dailypulse.articles.presentation.SourceViewModel
import org.koin.dsl.module

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.articles.di
 * Created by Arthur Dioses Reto on 25/03/24 at 10:51 AM
 * All rights reserved 2024.
 ****/

val sourcesModule = module {
    single<SourcesService> { SourcesService(get()) }
    single<SourceUseCase> { SourceUseCase(get()) }
    single<SourceViewModel> { SourceViewModel(get()) }
    single<SourceDatabaseSource> { SourceDatabaseSource(get()) }
    single<SourceRepository> { SourceRepository(get(), get()) }
}