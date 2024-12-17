package com.kong.data.calendar.datasource

import com.kong.data.calendar.dto.NextSessionResponse

interface CalendarRemoteDataSource {

    suspend fun getNextSession(): NextSessionResponse?
}