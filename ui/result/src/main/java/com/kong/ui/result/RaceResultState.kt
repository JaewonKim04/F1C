package com.kong.ui.result

import com.kong.common.Session
import com.kong.result.model.DriverResult

data class RaceResultState(

    val session: Session? = null,
    val driverResults: List<DriverResult> = emptyList(),

    val selectedResultType: SelectedResultType = SelectedResultType.RANK
) {

    enum class SelectedResultType {

        RANK,
        ANALYZE
    }
}
