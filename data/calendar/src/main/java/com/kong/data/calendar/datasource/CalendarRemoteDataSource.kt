package com.kong.data.calendar.datasource

import com.kong.data.calendar.dto.CalendarSessionResponse
import com.kong.data.calendar.dto.NextSessionResponse
import java.time.YearMonth

interface CalendarRemoteDataSource {

    suspend fun getNextSession(): NextSessionResponse?

    suspend fun getSessionsByYearMonth(yearMonth: YearMonth): List<CalendarSessionResponse>
}