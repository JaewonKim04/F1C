package com.kong.ui.result

import com.kong.result.model.DriverResult
import com.kong.result.model.SessionResult
import com.kong.ui.result.components.ResultType

data class SessionResultState(
    val season: Int = 0,
    val round: Int = 0,

    val sessionResult: SessionResult? = null,

    val summaries: List<String> = emptyList(),

    val selectedResultType: ResultType = ResultType.RANK
) {

    val driverResults: List<DriverResult> get() = sessionResult?.driverResultList.orEmpty()
}
