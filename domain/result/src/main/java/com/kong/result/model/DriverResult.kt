package com.kong.result.model

import com.kong.common.Driver
import java.time.LocalDateTime

data class DriverResult(
    val driver: Driver,
    val timeText: String,
    val isFinishedSession: Boolean
)
