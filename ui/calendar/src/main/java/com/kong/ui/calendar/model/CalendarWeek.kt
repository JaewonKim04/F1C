package com.kong.ui.calendar.model

import java.time.DayOfWeek

enum class CalendarWeek(
    val displayName: String,
    val dayOfWeek: DayOfWeek,
    val displayOrder: Int,
) {
    SUNDAY("일", DayOfWeek.SUNDAY, 0),
    MONDAY("월", DayOfWeek.MONDAY, 1),
    TUESDAY("화", DayOfWeek.TUESDAY, 2),
    WEDNESDAY("수", DayOfWeek.WEDNESDAY, 3),
    THURSDAY("목", DayOfWeek.THURSDAY, 4),
    FRIDAY("금", DayOfWeek.FRIDAY, 5),
    SATURDAY("토", DayOfWeek.SATURDAY, 6);

    companion object {
        fun DayOfWeek.getCalendarWeek() = entries.find { it.dayOfWeek == this }
    }
}
