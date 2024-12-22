package com.kong.domain.calendar.repository

import com.kong.common.Session
import java.time.LocalDate
import java.time.YearMonth

interface CalendarRepository {

    suspend fun getNextSession(): Session?

    suspend fun getSessionsByYearMonth(yearMonth: YearMonth): Map<LocalDate, List<Session>>
}