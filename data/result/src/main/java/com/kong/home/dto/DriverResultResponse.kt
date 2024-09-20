package com.kong.home.dto

import com.kong.common.Driver

data class DriverResultResponse(
    val driverNumber: Int?,
    val sessionKey: Long?,
    val meetingKey: Long?,
    val broadCastName: String?,
    val firstName: String?,
    val lastName: String?,
    val fullName: String?,
    val fullNameKo: String?,
    val headshotUrl: String?,
    val teamColour: String?,
    val teamName: String?,
    val nameAcronym: String?,
    val countryCode: String?
) {

    fun toModel() = Driver(
        fullName = fullNameKo.orEmpty(),
        broadcastName = broadCastName.orEmpty(),
        headshotUrl = headshotUrl.orEmpty(),
        teamName = teamName.orEmpty(),
        teamColorHexCode = teamColour.orEmpty()
    )
}