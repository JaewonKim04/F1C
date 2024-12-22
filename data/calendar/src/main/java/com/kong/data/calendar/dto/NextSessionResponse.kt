package com.kong.data.calendar.dto

import com.kong.common.Session
import com.kong.common.SessionType
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class NextSessionResponse(
    val season: Int?,
    val round: Int?,
    val url: String?, // wiki
    val raceName: String?, // ~ grandPrix
    val circuitId: String?,
    val circuitName: String?,
    val raceType: String?,
    val raceDatetime: String?,
    val trackIconUrl: String?,
    val mapUrl: String?
) {

    fun toModel() = Session(
        sessionType = SessionType.getSessionTypeFromString(raceType),
        grandprixName = raceName.orEmpty(),
        circuitName = circuitName.orEmpty(),
        countryName = circuitId.orEmpty(),
        circuitImageUrl = trackIconUrl.orEmpty(),
        startDate = LocalDateTime.parse(
            raceDatetime,
            DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm")
        )
    )
}
