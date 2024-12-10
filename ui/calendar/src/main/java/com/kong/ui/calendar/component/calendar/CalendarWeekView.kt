package com.kong.ui.calendar.component.calendar

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kong.ui.calendar.CalendarState
import com.kong.ui.calendar.model.CalendarWeek
import com.kong.ui.core.util.DateUtil.getLocalDate
import java.time.YearMonth

@Composable
fun CalendarWeekView(
    state: CalendarState,
    showingYearMonth: YearMonth,
    weekNumberOfMonth: Int
) {
    val weekValues = remember { CalendarWeek.entries.toTypedArray() }

    Row {
        weekValues.forEach { calendarWeek ->
            val date = showingYearMonth.getLocalDate(weekNumberOfMonth, calendarWeek.dayOfWeek)

            if (date == null) {
                Spacer(
                    modifier = Modifier
                        .weight(1f)
                        .height(60.dp)
                )
            } else {
                CalendarDay(
                    modifier = Modifier.weight(1f),
                    date = date,
                    sessionList = state.localDateAndSessions.get(date).orEmpty()
                )
            }
        }
    }
}