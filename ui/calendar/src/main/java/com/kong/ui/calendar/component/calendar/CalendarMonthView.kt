package com.kong.ui.calendar.component.calendar

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.kong.ui.calendar.CalendarState
import com.kong.ui.core.component.Spacer
import androidx.compose.ui.unit.dp
import com.kong.ui.core.util.DateUtil.getWeekCountOfMonth
import java.time.YearMonth

@Composable
fun CalendarMonthView(
    state: CalendarState,
    showingYearMonth: YearMonth
) {
    val weekCount = remember(showingYearMonth) { showingYearMonth.getWeekCountOfMonth() }

    Column {
        CalendarWeekHeader()
        Spacer(dp = 5.dp)
        repeat(weekCount) { weekNumber ->
            CalendarWeekView(
                state = state,
                showingYearMonth = showingYearMonth,
                weekNumberOfMonth = weekNumber
            )
        }
        HorizontalDivider()
    }
}