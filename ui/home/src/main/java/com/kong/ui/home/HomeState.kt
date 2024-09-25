package com.kong.ui.home

import com.kong.result.model.LastRaceResultSummary

data class HomeState(
    val lastRaceResultSummary: LastRaceResultSummary? = null,
    val isLoading: Boolean = false
)
