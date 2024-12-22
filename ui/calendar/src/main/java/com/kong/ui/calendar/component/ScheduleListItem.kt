package com.kong.ui.calendar.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.kong.common.Session
import com.kong.common.SessionType
import com.kong.common.fake.FakeSession
import com.kong.ui.calendar.model.CalendarWeek.Companion.getCalendarWeek
import com.kong.ui.core.component.Spacer
import com.kong.ui.core.theme.Bold18
import com.kong.ui.core.theme.Regular14
import com.kong.ui.core.theme.Regular16
import com.kong.ui.core.theme.backgroundGray
import com.kong.ui.core.theme.black
import com.kong.ui.core.theme.darkGray
import com.kong.ui.core.theme.gray
import com.kong.ui.core.theme.qualifyingBackground
import com.kong.ui.core.theme.raceBackground
import com.kong.ui.core.util.DateUtil.toDisplayText
import java.time.LocalDate

@Composable
fun ScheduleListItem(
    date: LocalDate,
    sessionList: List<Session>
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 10.dp, end = 20.dp)
    ) {
        Text(
            text = "${date.dayOfMonth}일 ${date.dayOfWeek.getCalendarWeek()?.displayName}요일",
            style = Regular16,
            color = darkGray
        )
        Spacer(dp = 10.dp)

        sessionList.forEach {
            ScheduleItem(it)
            Spacer(dp = 10.dp)
        }
    }
}

@Composable
private fun ScheduleItem(
    session: Session
) {
    val itemColor = when (session.sessionType) {
        SessionType.RACE -> raceBackground
        SessionType.QUALIFYING -> qualifyingBackground
        else -> backgroundGray
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = itemColor, shape = RoundedCornerShape(6.dp))
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.Center) {
            Row(verticalAlignment = Alignment.Bottom) {
                Text(
                    text = session.sessionType.displayName,
                    style = Bold18,
                    color = black
                )
                Spacer(dp = 10.dp)
                Text(
                    text = "${session.startDate.toDisplayText("HH:mm")}",
                    style = Regular14,
                    color = gray
                )
            }
            Spacer(dp = 5.dp)
            Text(
                text = session.grandprixName,
                style = Regular16,
                color = gray
            )
        }

        AsyncImage(
            modifier = Modifier.size(40.dp),
            model = session.circuitImageUrl,
            contentDescription = null
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ScheduleListItem_Preview() {
    ScheduleListItem(
        date = LocalDate.now(),
        sessionList = listOf(
            FakeSession.getFakeSession(),
            FakeSession.getFakeSession(sessionType = SessionType.QUALIFYING),
            FakeSession.getFakeSession(sessionType = SessionType.PRACTICE1)
        )
    )
}
