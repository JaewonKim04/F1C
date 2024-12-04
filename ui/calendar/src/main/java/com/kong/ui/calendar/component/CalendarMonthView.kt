package com.kong.ui.calendar.component

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.kong.ui.calendar.CalendarState
import java.time.YearMonth
import java.time.temporal.WeekFields

@Composable
fun CalendarMonthView(
    state: CalendarState,
    showingYearMonth: YearMonth
) {

    val weekCount = remember(showingYearMonth) {
        showingYearMonth.atEndOfMonth().get(WeekFields.ISO.weekOfMonth())
    }

    Column {
        repeat(weekCount) { weekNumber ->
            CalendarWeekView(
                state = state,
                showingYearMonth = showingYearMonth,
                weekNumberOfMonth = weekNumber
            )
        }
    }

}