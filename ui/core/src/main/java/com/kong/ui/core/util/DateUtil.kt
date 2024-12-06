package com.kong.ui.core.util

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Period
import java.time.YearMonth
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.Calendar

object DateUtil {

    fun LocalDateTime?.toDisplayDate(): String? =
        this?.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm"))


    fun LocalDateTime.getLeftDay(): Int {
        val current = LocalDateTime.now()
        val period = Period.between(current.toLocalDate(), this.toLocalDate())
        return period.days
    }

    fun YearMonth.getLocalDate(weekOfMonth: Int, dayOfWeek: DayOfWeek): LocalDate? {
        val calendar = this.getCalendarInstance()
        val weekOfYear = calendar[Calendar.WEEK_OF_YEAR]
        calendar.setWeekDate(this.year, weekOfYear + weekOfMonth, dayOfWeek.value)

        val localDate =
            LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault()).toLocalDate()

        return if (localDate.year == this.year && localDate.monthValue == this.monthValue) localDate else null
    }

    private fun YearMonth.getCalendarInstance(): Calendar {
        val calendar = Calendar.getInstance()
        calendar[Calendar.YEAR] = this.year
        calendar[Calendar.MONTH] = this.monthValue - 1
        return calendar
    }

}