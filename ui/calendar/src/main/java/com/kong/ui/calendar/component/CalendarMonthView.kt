package com.kong.ui.calendar.component

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.kong.ui.calendar.CalendarState
import java.time.YearMonth
import java.util.Calendar

@Composable
fun CalendarMonthView(
    state: CalendarState,
    showingYearMonth: YearMonth
) {
    val weekCount = remember(showingYearMonth) {
        val calendar = Calendar.getInstance()
        calendar[Calendar.YEAR] = showingYearMonth.year
        calendar[Calendar.MONTH] = showingYearMonth.monthValue
        calendar.getActualMaximum(Calendar.WEEK_OF_MONTH)
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