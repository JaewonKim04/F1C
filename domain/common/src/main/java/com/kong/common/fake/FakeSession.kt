package com.kong.common.fake

import com.kong.common.Session
import com.kong.common.SessionType
import java.time.LocalDateTime

object FakeSession {

    fun getFakeSession(sessionType: SessionType = SessionType.RACE) = Session(
        sessionType = sessionType,
        grandprixName = "Bahrain Grand Prix",
        circuitName = "Sakhir Circuit",
        countryName = "BH",
        circuitImageUrl = "https://",
        startDate = LocalDateTime.now().plusDays(4)
    )
}