package com.kong.ui.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.kong.domain.common.Session
import com.kong.kong.core.R
import com.kong.ui.core.component.Spacer
import com.kong.ui.core.theme.Bold16
import com.kong.ui.core.theme.Bold18
import com.kong.ui.core.theme.Bold24
import com.kong.ui.core.theme.Regular14
import com.kong.ui.core.theme.black
import com.kong.ui.core.theme.darkGray
import com.kong.ui.core.theme.gray
import com.kong.ui.core.theme.lightGray
import com.kong.ui.core.theme.white
import com.kong.ui.core.util.DateUtil.getLeftDay
import com.kong.ui.core.util.DateUtil.toDisplayText

@Composable
fun NextSessionView(
    session: Session?,
    onClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = white, shape = RoundedCornerShape(16.dp))
            .clip(RoundedCornerShape(16.dp))
            .clickable { onClick() }
            .padding(16.dp)
    ) {
        if (session != null) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "다음경기",
                        style = Regular14,
                        color = lightGray
                    )
                    Spacer(3.dp)
                    Text(
                        text = session.grandprixName,
                        style = Bold24,
                        color = darkGray
                    )
                }

                AsyncImage(
                    modifier = Modifier.size(45.dp),
                    model = session.circuitImageUrl,
                    contentDescription = null
                )
            }

            Spacer(3.dp)
            Text(
                text = session.sessionType.displayName,
                style = Bold18,
                color = darkGray
            )
            Spacer(10.dp)

            Row(verticalAlignment = Alignment.Bottom) {
                val leftDay = session.startDate.getLeftDay()
                val text = when {
                    leftDay > 0 -> "${leftDay}일 남음"
                    leftDay == 0 -> "오늘"
                    else -> ""
                }
                if (text.isNotEmpty()) {
                    Text(
                        modifier = Modifier.padding(end = 4.dp),
                        text = text,
                        style = Bold16,
                        color = black
                    )
                }
                Spacer(dp = 5.dp)
                Text(
                    text = session.startDate.toDisplayText().orEmpty(),
                    style = Regular14,
                    color = lightGray
                )
            }
            Spacer(dp = 16.dp)
        }

        Row(
            modifier = Modifier.padding(vertical = 5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier.size(18.dp),
                painter = painterResource(id = R.drawable.baseline_calendar_today_24),
                tint = gray,
                contentDescription = null
            )
            Spacer(dp = 3.dp)
            Text(
                modifier = Modifier.weight(1f),
                text = "전체일정",
                color = gray,
                style = Regular14
            )
            Icon(
                modifier = Modifier.size(18.dp),
                painter = painterResource(id = R.drawable.baseline_chevron_right_24),
                contentDescription = null
            )
        }
    }
}