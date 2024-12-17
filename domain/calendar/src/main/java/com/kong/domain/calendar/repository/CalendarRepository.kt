package com.kong.domain.calendar.repository

import com.kong.common.Session

interface CalendarRepository {

    suspend fun getNextSession(): Session?
}