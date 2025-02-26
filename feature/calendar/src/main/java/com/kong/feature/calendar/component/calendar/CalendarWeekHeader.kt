package com.kong.feature.calendar.component.calendar

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.kong.feature.calendar.model.CalendarWeek
import com.kong.feature.core.theme.Regular12
import com.kong.feature.core.theme.gray
import com.kong.feature.core.theme.primary

@Composable
fun CalendarWeekHeader() {
    Row {
        CalendarWeek.entries.forEach {
            val textColor = if (it == CalendarWeek.SUNDAY) primary else gray
            Text(
                modifier = Modifier.weight(1f),
                text = it.displayName,
                style = Regular12,
                color = textColor,
                textAlign = TextAlign.Center
            )
        }
    }
}