package com.kong.ui.home

import com.kong.result.model.LastSessionResultSummary

data class HomeState(
    val lastSessionResultSummary: LastSessionResultSummary? = null,
    val isLoading: Boolean = false
)
