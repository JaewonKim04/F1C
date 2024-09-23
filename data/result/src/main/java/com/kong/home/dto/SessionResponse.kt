package com.kong.home.dto

import com.kong.common.Session
import com.kong.common.toSessionType
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class SessionResponse(
    val sessionKey: Long?,
    val sessionName: String?,
    val dateStart: String?,
    val dateEnd: String?,
    val gmtOffset: String?,
    val sessionType: String?,
    val meetingKey: Long?,
    val location: String?,
    val countryCode: String?,
    val countryName: String?,
    val circuitShortName: String?
) {

    fun toModel() = Session(
        sessionType = sessionType.toSessionType(),
        grandprixName = "$countryName Grand Prix",
        circuitName = "$circuitShortName Circuit",
        countryCode = countryCode.orEmpty(),
        startDate = LocalDateTime.parse(
            dateStart, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm")
        ).plusHours(9)
    )
}
