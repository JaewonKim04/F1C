package com.kongkong.ui.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kong.kong.core.component.Spacer
import com.kong.kong.core.theme.Bold18
import com.kong.kong.core.theme.Bold24
import com.kong.kong.core.theme.Regular14
import com.kong.kong.core.theme.black
import com.kong.kong.core.theme.darkGray
import com.kong.kong.core.theme.lightGray
import com.kong.kong.core.theme.white
import com.kongkong.home.model.LastRaceResultSummary
import com.kong.kong.core.R
import com.kongkong.ui.home.component.item.LastResultDriverItem

@Composable
fun LastResultView(
    lastRaceResultSummary: LastRaceResultSummary
) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .background(color = white, shape = RoundedCornerShape(16.dp))
            .clip(RoundedCornerShape(16.dp))
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "🏁",
                fontSize = 40.sp
            )
            Spacer(5.dp)
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "지난경기",
                    style = Regular14,
                    color = lightGray
                )
                Spacer(3.dp)
                Text(
                    text = lastRaceResultSummary.raceName,
                    style = Bold24,
                    color = darkGray
                )
                Spacer(3.dp)
                Text(
                    text = lastRaceResultSummary.sessionName,
                    style = Bold18,
                    color = darkGray
                )
            }
            Icon(
                modifier = Modifier.size(20.dp),
                imageVector = ImageVector.vectorResource(R.drawable.baseline_chevron_right_24),
                tint = black,
                contentDescription = null
            )
        }
        Spacer(10.dp)
        lastRaceResultSummary.firstThreeDriverResultList.forEachIndexed { index, driver ->
            LastResultDriverItem(
                index = index,
                driver = driver
            )
            Spacer(dp = 3.dp)
        }
    }
}