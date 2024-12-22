package com.kong.home.dto.session

import com.kong.common.Session
import com.kong.common.SessionType
import com.kong.home.dto.driver.DriverResultResponse
import com.kong.result.model.SessionResult
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class SessionResultResponse(
    val season: Int?,
    val round: Int?,
    val url: String?,
    val raceName: String?,
    val circuit: CircuitResponse?,
    val raceDatetime: String?,
    val drivers: List<DriverResultResponse>?
) {

    fun toModel() = SessionResult(
        session = Session(
            sessionType = SessionType.RACE,
            grandprixName = raceName.orEmpty(),
            circuitName = circuit?.circuitName.orEmpty(),
            countryName = circuit?.country.orEmpty(),
            startDate = LocalDateTime.parse(
                raceDatetime.orEmpty(),
                DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm")
            )
        ),
        driverResultList = drivers?.map { it.toModel() }.orEmpty()
    )
}
