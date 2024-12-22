package com.kong.result.model

import com.kong.common.SessionType

data class LastSessionResultSummary(
    val season: Int,
    val round: Int,
    val sessionName: String,
    val sessionType: SessionType,
    val firstThreeDriverResultList: List<DriverResult>
)
