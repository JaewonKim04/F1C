package com.kong.domain.result.model

import com.kong.domain.common.Driver
import java.time.LocalDateTime

data class DriverResult(
    val driver: Driver,
    val timeText: String?,
    val isFinishedSession: Boolean
)
