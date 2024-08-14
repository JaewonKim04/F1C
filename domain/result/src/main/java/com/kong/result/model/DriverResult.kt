package com.kong.result.model

import com.kong.common.Driver
import java.time.LocalDateTime

data class DriverResult(
    val driver: Driver,
    val raceTime: LocalDateTime,
    val interval: Float,
    val gapToLeader: Float
)
