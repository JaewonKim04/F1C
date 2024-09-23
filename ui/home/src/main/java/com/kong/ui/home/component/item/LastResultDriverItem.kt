package com.kong.ui.home.component.item

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.kong.ui.core.component.Spacer
import com.kong.ui.core.theme.Bold14
import com.kong.ui.core.theme.Regular14
import com.kong.ui.core.theme.darkGray
import com.kong.ui.core.theme.getColorFromHexCode
import com.kong.ui.core.theme.lightGray
import com.kong.common.Driver
import com.kong.ui.core.theme.Bold16
import com.kong.ui.core.theme.Regular12
import com.kong.ui.core.theme.gray
import com.kong.ui.core.util.RankUtil

@Composable
fun LastResultDriverItem(index: Int, driver: Driver) {
    val rankText = remember(index) { RankUtil.getRankText(index) }
    Row(verticalAlignment = Alignment.CenterVertically) {
        Box(
            modifier = Modifier
                .size(width = 5.dp, height = 45.dp)
                .background(
                    color = getColorFromHexCode(driver.teamColorHexCode),
                    shape = RoundedCornerShape(3.dp)
                )
        )
        AsyncImage(
            modifier = Modifier.size(43.dp),
            model = driver.headshotUrl,
            contentDescription = null
        )
        Spacer(10.dp)
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = driver.fullName,
                style = Bold16,
                color = darkGray
            )
            Spacer(dp = 3.dp)
            Text(
                text = driver.teamName,
                style = Regular12,
                color = gray
            )
        }

        Text(
            text = rankText,
            style = Regular14,
            color = lightGray,
            textAlign = TextAlign.End
        )
    }
}