package com.kongkong.home.model

import com.kongkong.common.Driver

data class LastRaceResultSummary(
    val raceName: String,
    val sessionName: String,
    val firstThreeDriverResultList: List<Driver>
)
