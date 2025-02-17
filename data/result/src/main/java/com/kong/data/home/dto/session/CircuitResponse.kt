package com.kong.data.home.dto.session

data class CircuitResponse(
    val season: Int?,
    val circuitId: String?,
    val url: String?,
    val circuitName: String,
    val latitude: Double?,
    val longitude: Double?,
    val country: String?,
    val locality: String?,
    val trackIconUrl: String?,
    val mapUrl: String?
)
