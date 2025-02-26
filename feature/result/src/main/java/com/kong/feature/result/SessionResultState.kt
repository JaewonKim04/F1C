package com.kong.feature.result

import com.kong.domain.result.model.DriverResult
import com.kong.domain.result.model.SessionResult
import com.kong.feature.result.components.ResultType

data class SessionResultState(
    val season: Int = 0,
    val round: Int = 0,

    val sessionResult: SessionResult? = null,

    val summaries: List<String> = emptyList(),
    val fastestLapDriverResults: List<DriverResult> = emptyList(),

    val selectedResultType: ResultType = ResultType.RANK
) {

    val driverResults: List<DriverResult> get() = sessionResult?.driverResultList.orEmpty()
}
