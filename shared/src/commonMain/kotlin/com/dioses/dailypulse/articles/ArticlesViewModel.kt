package com.dioses.dailypulse.articles

import com.dioses.dailypulse.BaseViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.aticles
 * Created by Arthur Dioses Reto on 20/03/24 at 1:05 PM
 * All rights reserved 2024.
 ****/
class ArticlesViewModel : BaseViewModel() {
    private val _articlesState: MutableStateFlow<ArticlesState> = MutableStateFlow(ArticlesState())
    val articlesState: StateFlow<ArticlesState> get() = _articlesState
}