package com.kong.result.model

import com.kong.common.Session

data class SessionResult(
    val session: Session,
    val driverResultList: List<DriverResult>
)
