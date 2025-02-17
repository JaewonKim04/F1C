package com.kong.data.home.dto

data class LatestSessionResponse(
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
