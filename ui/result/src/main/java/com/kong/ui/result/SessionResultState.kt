package com.kong.ui.result

import com.kong.result.model.DriverResult
import com.kong.result.model.SessionResult
import com.kong.ui.result.components.ResultType

data class SessionResultState(
    val season: Int = 0,
    val round: Int = 0,

    val sessionResult: SessionResult? = null,
    val driverResults: List<DriverResult> = emptyList(),

    val summaries: List<String> = emptyList(),

    val selectedResultType: ResultType = ResultType.RANK
)
