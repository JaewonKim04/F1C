package com.kong.home.dto.driver

import com.kong.domain.common.Driver

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

fun DriverResponse?.toModel(constructor: ConstructorResponse?) = Driver(
    fullName = this?.fullNameKo.orEmpty(),
    broadcastName = this?.code.orEmpty(),
    headshotUrl = this?.headshotUrl.orEmpty(),
    teamName = constructor?.name.orEmpty(),
    teamColorHexCode = constructor?.color.orEmpty()
)