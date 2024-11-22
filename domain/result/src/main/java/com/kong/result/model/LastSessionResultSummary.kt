package com.kong.result.model

import com.kong.common.Driver
import com.kong.common.SessionType

data class LastSessionResultSummary(
    val sessionKey: Long,
    val sessionName: String,
    val sessionType: SessionType,
    val firstThreeDriverResultList: List<Driver>
)
