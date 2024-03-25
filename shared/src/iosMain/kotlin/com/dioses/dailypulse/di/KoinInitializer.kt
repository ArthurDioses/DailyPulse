package com.dioses.dailypulse.di

import com.dioses.dailypulse.articles.ArticlesViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.di
 * Created by Arthur Dioses Reto on 24/03/24 at 2:26 PM
 * All rights reserved 2024.
 ****/

fun initKoin() {
    val module = sharedKoinModule + databaseModule

    startKoin {
        modules(module)
    }
}

class ArticlesInjector : KoinComponent {
    val articlesViewModel: ArticlesViewModel by inject()
}