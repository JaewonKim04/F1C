package com.kong.ui.calendar.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kong.kong.core.R
import com.kong.ui.calendar.CalendarState
import com.kong.ui.core.component.Spacer
import com.kong.ui.core.theme.Regular24
import com.kong.ui.core.theme.black
import com.kong.ui.core.util.DateUtil.toDisplayText

@Composable
fun CalendarTopBar(
    state: CalendarState,
    onClickBack: () -> Unit,
    onClickNextMonth: () -> Unit,
    onClickBeforeMonth: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Icon(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .size(35.dp)
                .clickable { onClickBack() },
            painter = painterResource(id = R.drawable.baseline_chevron_left_24),
            contentDescription = null
        )

        Row(
            modifier = Modifier.align(Alignment.Center),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier
                    .size(30.dp)
                    .clip(CircleShape)
                    .clickable { onClickBeforeMonth() },
                painter = painterResource(id = R.drawable.baseline_arrow_left_24),
                contentDescription = null
            )
            Spacer(dp = 10.dp)

            Text(
                text = state.showingYearMonth.toDisplayText(),
                style = Regular24,
                color = black
            )
            Spacer(dp = 10.dp)

            Icon(
                modifier = Modifier
                    .size(30.dp)
                    .clip(CircleShape)
                    .clickable { onClickNextMonth() },
                painter = painterResource(id = R.drawable.baseline_arrow_right_24),
                contentDescription = null
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CalendarTopBar_Preview() {
    CalendarTopBar(
        state = CalendarState(),
        onClickBack = { },
        onClickNextMonth = { },
        onClickBeforeMonth = {})
}