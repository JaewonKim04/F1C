package com.kong.ui.core.util

import java.time.LocalDateTime
import java.time.Period
import java.time.format.DateTimeFormatter

object DateUtil {

    fun LocalDateTime?.toDisplayDate(): String? =
        this?.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm"))


    fun LocalDateTime.getLeftDay(): Int? {
        val current = LocalDateTime.now()
        val period = Period.between(current.toLocalDate(), this.toLocalDate())
        return period.days
    }


}