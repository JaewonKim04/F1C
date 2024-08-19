package com.kong.ui.core.util

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object DateUtil {

    fun LocalDateTime?.toDisplayDate() : String? {
        return this?.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm"))
    }
}