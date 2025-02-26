package com.kong.feature.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import com.kong.feature.core.component.Spacer
import com.kong.feature.core.theme.Bold18
import com.kong.feature.core.theme.Bold24
import com.kong.feature.core.theme.Regular14
import com.kong.feature.core.theme.black
import com.kong.feature.core.theme.darkGray
import com.kong.feature.core.theme.lightGray
import com.kong.feature.core.theme.white
import com.kong.domain.result.model.LastSessionResultSummary
import com.kong.kong.core.R
import com.kong.feature.home.component.item.LastResultDriverItem

@Composable
fun LastResultView(
    lastSessionResultSummary: LastSessionResultSummary?,
    onClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .background(color = white, shape = RoundedCornerShape(16.dp))
            .clip(RoundedCornerShape(16.dp))
            .clickable { onClick() }
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
                    text = lastSessionResultSummary?.sessionName.orEmpty(),
                    style = Bold24,
                    color = darkGray
                )
                Spacer(3.dp)
                Text(
                    text = lastSessionResultSummary?.sessionType?.displayName.orEmpty(),
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
        lastSessionResultSummary?.firstThreeDriverResultList?.forEachIndexed { index, result ->
            LastResultDriverItem(
                index = index,
                driverResult = result
            )
            Spacer(dp = 8.dp)
        }
    }
}