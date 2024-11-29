package com.kong.ui.calendar.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.kong.ui.calendar.CalendarState
import java.time.temporal.WeekFields

@Composable
fun CalendarMonth(state: CalendarState) {
    val weekCount = remember(state.showingYearMonth) {
        state.showingYearMonth.get(WeekFields.ISO.weekOfMonth())
    }
    repeat(weekCount) {

    }
}