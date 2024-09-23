package com.kong.result.model

import com.kong.common.Driver
import com.kong.common.SessionType

data class LastRaceResultSummary(
    val sessionKey: Long,
    val raceName: String,
    val sessionType: SessionType,
    val firstThreeDriverResultList: List<Driver>
)
