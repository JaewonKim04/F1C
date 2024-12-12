package com.kong.home.dto.session

import com.kong.home.dto.driver.DriverResultResponse
import com.kong.result.model.SessionResult

data class SessionResultResponse(
    val season: Int?,
    val round: Int?,
    val url: String?,
    val raceName: String?,
    val circuit: CircuitResponse?,
    val raceDatetime: String?,
    val drivers: List<DriverResultResponse>?
) {

}
