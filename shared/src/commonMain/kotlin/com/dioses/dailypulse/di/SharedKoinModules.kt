package com.dioses.dailypulse.di

import com.dioses.dailypulse.articles.di.articlesModule
import com.dioses.dailypulse.articles.di.sourcesModule

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.di
 * Created by Arthur Dioses Reto on 24/03/24 at 12:55 PM
 * All rights reserved 2024.
 ****/

val sharedKoinModule = listOf(
    articlesModule,
    sourcesModule,
    networkModule
)