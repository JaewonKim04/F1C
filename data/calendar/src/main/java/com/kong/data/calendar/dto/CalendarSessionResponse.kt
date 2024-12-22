package com.kong.data.calendar.dto

import com.kong.common.Session
import com.kong.common.SessionType
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class CalendarSessionResponse(
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
)

fun List<CalendarSessionResponse>.toModel() = map {
    Session(
        sessionType = SessionType.getSessionTypeFromString(it.raceType),
        grandprixName = it.raceName.orEmpty(),
        circuitName = it.circuitName.orEmpty(),
        countryName = it.circuitId.orEmpty(),
        circuitImageUrl = it.trackIconUrl.orEmpty(),
        startDate = LocalDateTime.parse(
            it.raceDatetime,
            DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm")
        )
    )
}.groupBy {
    it.startDate.toLocalDate()
}