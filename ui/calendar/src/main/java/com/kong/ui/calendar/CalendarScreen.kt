package com.kong.ui.calendar

import androidx.compose.runtime.Composable
import com.kong.ui.calendar.component.CalendarMonthView

@Composable
fun CalendarScreen() {
    val state = CalendarState()
    CalendarMonthView(
        state = state,
        showingYearMonth = state.showingYearMonth
    )
}
