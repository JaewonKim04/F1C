package com.kong.ui.calendar.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kong.ui.core.component.Spacer
import com.kong.ui.core.theme.Regular12
import com.kong.ui.core.theme.Regular14
import com.kong.ui.core.theme.gray
import com.kong.ui.core.theme.primary
import com.kong.ui.core.theme.white
import java.time.LocalDateTime

enum class CalendarDayIndicatorStyle {
    LEFT_ROUND,
    MIDDLE,
    RIGHT_ROUND,
    EMPTY
}

@Composable
fun CalendarDay(
    modifier: Modifier = Modifier,
    date: LocalDateTime,
    sessionName: String,
    indicatorStyle: CalendarDayIndicatorStyle
) {
    Column(
        modifier = modifier
            .padding(vertical = 3.dp)
            .height(60.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "${date.dayOfMonth}",
            style = Regular12,
            color = gray
        )
        Spacer(dp = 10.dp)

        if (indicatorStyle != CalendarDayIndicatorStyle.EMPTY) {
            val indicatorShape = when (indicatorStyle) {
                CalendarDayIndicatorStyle.LEFT_ROUND ->
                    RoundedCornerShape(topStart = 10.dp, bottomStart = 10.dp)

                CalendarDayIndicatorStyle.RIGHT_ROUND ->
                    RoundedCornerShape(topEnd = 10.dp, bottomEnd = 10.dp)

                else -> RectangleShape
            }
            Box(
                modifier = Modifier
                    .height(20.dp)
                    .fillMaxWidth()
                    .background(primary, indicatorShape),
                contentAlignment = Alignment.Center
            ) {
                if (indicatorStyle == CalendarDayIndicatorStyle.MIDDLE) {
                    Text(
                        text = sessionName,
                        style = Regular14,
                        color = white
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CalendarDay_Preview1() {
    CalendarDay(
        date = LocalDateTime.now(),
        sessionName = "BEL",
        indicatorStyle = CalendarDayIndicatorStyle.LEFT_ROUND
    )
}

@Preview(showBackground = true)
@Composable
private fun CalendarDay_Preview2() {
    CalendarDay(
        date = LocalDateTime.now(),
        sessionName = "BEL",
        indicatorStyle = CalendarDayIndicatorStyle.MIDDLE
    )
}

@Preview(showBackground = true)
@Composable
private fun CalendarDay_Preview3() {
    CalendarDay(
        date = LocalDateTime.now(),
        sessionName = "BEL",
        indicatorStyle = CalendarDayIndicatorStyle.RIGHT_ROUND
    )
}
