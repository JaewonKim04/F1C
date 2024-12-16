package com.kong.common

import java.time.LocalDateTime

data class Session(
    val sessionType: SessionType,
    val grandprixName: String,
    val circuitName: String,
    val countryName: String,
    val startDate: LocalDateTime
)
