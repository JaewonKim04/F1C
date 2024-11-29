package com.kong.ui.calendar

import java.time.YearMonth

data class CalendarState(
    val showingYearMonth: YearMonth = YearMonth.now()
)