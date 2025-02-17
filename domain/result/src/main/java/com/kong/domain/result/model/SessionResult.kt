package com.kong.domain.result.model

import com.kong.domain.common.Session

data class SessionResult(
    val session: Session,
    val driverResultList: List<DriverResult>
)
