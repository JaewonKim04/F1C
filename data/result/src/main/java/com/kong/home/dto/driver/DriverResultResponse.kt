package com.kong.home.dto.driver

import com.kong.common.Driver
import com.kong.result.model.DriverResult

data class DriverResultResponse(
    val driver: DriverResponse?,
    val position: Int?,
    val constructor: ConstructorResponse?,
    val status: String?,
    val timeText: String?
) {

    fun toModel() = DriverResult(
        driver = getDriverModel(),
        timeText = timeText ?: status,
        isFinishedSession = status == FINISH_STATUS || status?.contains(PLUS_LAP_STATUS) ?: false
    )

    private fun getDriverModel() = Driver(
        fullName = driver?.fullNameKo.orEmpty(),
        broadcastName = driver?.code.orEmpty(),
        headshotUrl = driver?.headshotUrl.orEmpty(),
        teamName = constructor?.name.orEmpty(),
        teamColorHexCode = constructor?.color.orEmpty()
    )

    companion object {
        private const val FINISH_STATUS = "Finished"
        private const val PLUS_LAP_STATUS = "Lap"
    }
}