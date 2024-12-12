package com.kong.home.dto.driver

import com.kong.common.Driver

data class DriverResponse(
    val season: Int?,
    val driverId: String?,
    val permanentNumber: Int?,
    val code: String?,
    val givenName: String?,
    val familyName: String?,
    val nationality: String?,
    val fullNameKo: String?,
    val headshotUrl: String?
)
