package com.kong.home.dto.driver

import com.kong.result.model.DriverResult

data class DriverResultResponse(
    val driver: DriverResponse?,
    val position: Int?,
    val constructor: ConstructorResponse?,
    val status: String?,
    val timeText: String?
) {

    fun toModel() = DriverResult(
        driver = driver.toModel(constructor),
        timeText = timeText ?: status,
        isFinishedSession = status == FINISH_STATUS || status?.contains(PLUS_LAP_STATUS) ?: false
    )

    companion object {
        private const val FINISH_STATUS = "Finished"
        private const val PLUS_LAP_STATUS = "Lap"
    }
}