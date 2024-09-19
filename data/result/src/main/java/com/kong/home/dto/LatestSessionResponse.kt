package com.kong.home.dto

import java.util.Date

data class LatestSessionResponse(
    val sessionKey: Long?,
    val sessionName: String?,
    val dateStart: Date?,
    val dateEnd: Date?,
    val gmtOffset: String?,
    val sessionType: String?,
    val meetingKey: Long?,
    val location: String?,
    val countryCode: String?
)
