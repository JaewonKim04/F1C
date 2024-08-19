package com.kong.common.fake

import com.kong.common.Session
import com.kong.common.SessionType
import java.time.LocalDateTime

object FakeSession {

    fun getFakeSession() = Session(
        sessionType = SessionType.RACE,
        grandprixName = "Bahrain Grand Prix",
        circuitName = "Sakhir Circuit",
        countryCode = "BH",
        startDate = LocalDateTime.of(2024, 4, 23, 13, 0)
    )
}