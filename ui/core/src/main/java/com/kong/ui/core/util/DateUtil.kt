package com.kong.ui.core.util

import java.time.DayOfWeek
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Period
import java.time.YearMonth
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.Calendar

object DateUtil {

    fun LocalDateTime?.toDisplayText(pattern: String = "yyyy.MM.dd HH:mm"): String? =
        this?.format(DateTimeFormatter.ofPattern(pattern))

    fun LocalDateTime.getLeftDay(): Int {
        val current = LocalDateTime.now()
        val period = Period.between(current.toLocalDate(), this.toLocalDate())
        return period.days
    }

    fun YearMonth.toDisplayText(): String =
        this.format(DateTimeFormatter.ofPattern("yyyy.MM"))

    fun YearMonth.getLocalDate(weekOfMonth: Int, dayOfWeek: DayOfWeek): LocalDate? {
        val calendar = this.getCalendarInstance()
        val weekOfYear = calendar[Calendar.WEEK_OF_YEAR]
        calendar.setWeekDate(this.year, weekOfYear + weekOfMonth, dayOfWeek.value)

        val localDate = calendar.toLocalDate()

        return if (localDate.year == this.year && localDate.monthValue == this.monthValue) localDate else null
    }

    fun YearMonth.getWeekCountOfMonth(): Int {
        val calendar = this.getCalendarInstance()
        return calendar.getActualMaximum(Calendar.WEEK_OF_MONTH)
    }

    private fun YearMonth.getCalendarInstance(): Calendar {
        val calendar = Calendar.getInstance()
        calendar[Calendar.YEAR] = this.year
        calendar[Calendar.MONTH] = this.monthValue - 1
        calendar[Calendar.DAY_OF_MONTH] = 1
        return calendar
    }

    private fun Calendar.toLocalDate(): LocalDate {
        val instant = Instant.ofEpochMilli(this.timeInMillis)
        return instant.atZone(ZoneId.systemDefault()).toLocalDate()
    }
}