package com.kong.ui.home

import com.kong.common.Session
import com.kong.result.model.LastSessionResultSummary

data class HomeState(
    val lastSessionResultSummary: LastSessionResultSummary? = null,
    val isLastSessionLoading: Boolean = false,
    val nextSession: Session? = null,
    val isNextSessionLoading: Boolean = false
)
