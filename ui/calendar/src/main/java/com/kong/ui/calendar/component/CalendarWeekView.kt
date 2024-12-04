package com.kong.ui.calendar.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kong.ui.calendar.CalendarState
import com.kong.ui.calendar.model.CalendarWeek
import java.time.LocalDate
import java.time.YearMonth
import java.time.temporal.TemporalAdjusters

@Composable
fun CalendarWeekView(
    state: CalendarState,
    showingYearMonth: YearMonth,
    weekNumberOfMonth: Int
) {
    val weekValues = remember { CalendarWeek.entries.toTypedArray() }

    Row {
        weekValues.forEach { calendarWeek ->
            val date = LocalDate.from(showingYearMonth.atDay(1))
                .with(TemporalAdjusters.dayOfWeekInMonth(weekNumberOfMonth, calendarWeek.dayOfWeek))

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