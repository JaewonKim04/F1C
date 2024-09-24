package com.kong.ui.result

import com.kong.common.Session
import com.kong.result.model.DriverResult
import com.kong.ui.result.components.ResultType

data class RaceResultState(

    val session: Session? = null,
    val driverResults: List<DriverResult> = emptyList(),

    val summaries: List<String> = emptyList(),

    val selectedResultType: ResultType = ResultType.RANK
)
