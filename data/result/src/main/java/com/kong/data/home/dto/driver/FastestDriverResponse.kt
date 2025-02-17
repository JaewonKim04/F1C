package com.kong.data.home.dto.driver

import com.kong.domain.result.model.DriverResult

data class FastestDriverResponse(
    val driver: DriverResponse?,
    val constructor: ConstructorResponse?,
    val lap: Int?,
    val time: String?
) {

    fun toModel() = DriverResult(
        driver = driver.toModel(constructor),
        timeText = "${time.orEmpty()} - Lap${lap}",
        isFinishedSession = true
    )
}
