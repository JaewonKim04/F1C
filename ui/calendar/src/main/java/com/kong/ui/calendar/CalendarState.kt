package com.kong.ui.calendar

import com.kong.domain.common.Session
import java.time.LocalDate
import java.time.YearMonth

data class CalendarState(
    val showingYearMonth: YearMonth = YearMonth.now(),
    val localDateAndSessions: Map<LocalDate, List<Session>> = emptyMap()
)