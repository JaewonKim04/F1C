package com.kong.home.dto

data class LatestSessionResponse(
    val sessionKey: Long?,
    val sessionName: String?,
    val dateStart: String?,
    val dateEnd: String?,
    val gmtOffset: String?,
    val sessionType: String?,
    val meetingKey: Long?,
    val location: String?,
    val countryCode: String?,
    val countryName: String?
)
