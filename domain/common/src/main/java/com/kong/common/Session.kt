package com.kong.common

import java.time.LocalDateTime

data class Session(
    val sessionName: String,
    val sessionType: SessionType,
    val grandprixName: String,
    val circuitName: String,
    val countryCode: String,
    val startDate: LocalDateTime
)
