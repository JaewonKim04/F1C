package com.kong.ui.home

import com.kong.domain.common.Session
import com.kong.domain.result.model.LastSessionResultSummary

data class HomeState(
    val lastSessionResultSummary: LastSessionResultSummary? = null,
    val isLastSessionLoading: Boolean = false,
    val nextSession: Session? = null,
    val isNextSessionLoading: Boolean = false
)
