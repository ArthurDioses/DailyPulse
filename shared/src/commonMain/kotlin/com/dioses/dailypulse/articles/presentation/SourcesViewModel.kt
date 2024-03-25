package com.dioses.dailypulse.articles.presentation

import com.dioses.dailypulse.BaseViewModel
import com.dioses.dailypulse.articles.application.SourceUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.articles.presentation
 * Created by Arthur Dioses Reto on 25/03/24 at 10:12 AM
 * All rights reserved 2024.
 ****/
class SourcesViewModel(
    private val useCase: SourceUseCase,
) : BaseViewModel() {

    private val _sourcesState: MutableStateFlow<SourcesState> =
        MutableStateFlow(SourcesState(listOf(), loading = true, null))

    val sourcesState: StateFlow<SourcesState> get() = _sourcesState

    init {
        getSources()
    }

    private fun getSources() {
        scope.launch {
            _sourcesState.emit(
                SourcesState(
                    sources = _sourcesState.value.sources,
                    loading = true,
                    null
                )
            )
            val fetchSources = useCase.getSources()

            _sourcesState.emit(SourcesState(sources = fetchSources))
        }
    }
}