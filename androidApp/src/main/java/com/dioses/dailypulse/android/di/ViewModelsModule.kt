package com.dioses.dailypulse.android.di

import com.dioses.dailypulse.articles.presentation.ArticlesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.android.di
 * Created by Arthur Dioses Reto on 24/03/24 at 1:03 PM
 * All rights reserved 2024.
 ****/

val viewModelsModule = module {
    viewModel {
        ArticlesViewModel(get())
    }
}