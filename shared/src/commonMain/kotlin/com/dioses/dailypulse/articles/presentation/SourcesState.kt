package com.dioses.dailypulse.articles.presentation

import com.dioses.dailypulse.articles.application.Source

data class SourcesState(
    val sources: List<Source>,
    val loading: Boolean = false,
    val error: String? = null,
)