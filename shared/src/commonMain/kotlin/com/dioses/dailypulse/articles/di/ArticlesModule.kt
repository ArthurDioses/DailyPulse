package com.dioses.dailypulse.articles.di

import com.dioses.dailypulse.articles.data.ArticlesDatabaseSource
import com.dioses.dailypulse.articles.data.ArticlesRepository
import com.dioses.dailypulse.articles.data.ArticlesService
import com.dioses.dailypulse.articles.application.ArticlesUseCase
import com.dioses.dailypulse.articles.presentation.ArticlesViewModel
import org.koin.dsl.module

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.articles.di
 * Created by Arthur Dioses Reto on 24/03/24 at 11:33 AM
 * All rights reserved 2024.
 ****/

val articlesModule = module {
    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
    single<ArticlesDatabaseSource> { ArticlesDatabaseSource(get()) }
    single<ArticlesRepository> { ArticlesRepository(get(), get()) }
}