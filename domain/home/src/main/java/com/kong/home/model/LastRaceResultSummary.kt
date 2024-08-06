package com.kong.home.model

import com.kong.common.Driver

data class LastRaceResultSummary(
    val raceName: String,
    val sessionName: String,
    val firstThreeDriverResultList: List<Driver>
)
