package com.kongkong.ui.home.component.item

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
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
import com.kong.kong.core.component.Spacer
import com.kong.kong.core.theme.Bold14
import com.kong.kong.core.theme.Regular14
import com.kong.kong.core.theme.darkGray
import com.kong.kong.core.theme.getColorFromHexCode
import com.kong.kong.core.theme.lightGray
import com.kongkong.common.Driver

@Composable
fun LastResultDriverItem(index: Int, driver: Driver) {
    val rankText = remember(index) {
        when (index) {
            0 -> "1st"
            1 -> "2nd"
            2 -> "3rd"
            else -> ""
        }
    }
    Row(verticalAlignment = Alignment.CenterVertically) {
        Box(
            modifier = Modifier.size(width = 5.dp, height = 30.dp).background(
                color = getColorFromHexCode(driver.teamColorHexCode),
                shape = RoundedCornerShape(3.dp)
            )
        )
        Spacer(5.dp)
        AsyncImage(
            modifier = Modifier.size(30.dp),
            model = driver.headshotUrl,
            contentDescription = null
        )
        Spacer(5.dp)
        Text(
            modifier = Modifier.weight(1f),
            text = driver.broadcastName,
            style = Bold14,
            color = darkGray
        )
        Text(
            text = rankText,
            style = Regular14,
            color = lightGray,
            textAlign = TextAlign.End
        )
    }
}