package com.kong.ui.home.component.loading

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
import com.kong.kong.core.R
import com.kong.ui.core.component.ContentLoadingView
import com.kong.ui.core.component.Spacer
import com.kong.ui.core.component.TitleLoadingView
import com.kong.ui.core.theme.Regular14
import com.kong.ui.core.theme.gray
import com.kong.ui.core.theme.lightGray
import com.kong.ui.core.theme.white

@Composable
fun NextSessionLoadingView(
    onClickCalendar: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = white, shape = RoundedCornerShape(16.dp))
            .clip(RoundedCornerShape(16.dp))
            .padding(16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "다음경기",
                    style = Regular14,
                    color = lightGray
                )
                Spacer(3.dp)
                TitleLoadingView()
            }
        }

        Spacer(3.dp)
        ContentLoadingView()
        Spacer(10.dp)

        ContentLoadingView()
        Spacer(dp = 16.dp)

        Row(
            modifier = Modifier
                .clickable { onClickCalendar() }
                .padding(vertical = 5.dp),
            verticalAlignment = Alignment.CenterVertically) {
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