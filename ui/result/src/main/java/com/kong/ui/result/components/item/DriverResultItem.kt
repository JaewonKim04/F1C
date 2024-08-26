package com.kong.ui.result.components.item

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
import androidx.compose.ui.unit.dp
import com.kong.result.model.DriverResult
import com.kong.ui.core.component.Spacer
import com.kong.ui.core.theme.Bold16
import com.kong.ui.core.theme.Regular14
import com.kong.ui.core.theme.black
import com.kong.ui.core.theme.getColorFromHexCode
import com.kong.ui.core.theme.gray
import com.kong.ui.core.util.RankUtil

@Composable
fun DriverResultItem(
    index: Int,
    driverResult: DriverResult
) {
    val driver = remember(driverResult) { driverResult.driver }
    val rankText = remember(index) { RankUtil.getRankText(index) }
    Row(verticalAlignment = Alignment.CenterVertically) {
        Box(
            modifier = Modifier
                .size(width = 5.dp, height = 40.dp)
                .background(
                    color = getColorFromHexCode(driver.teamColorHexCode),
                    shape = RoundedCornerShape(3.dp)
                )
        )

        Spacer(dp = 10.dp)

        Text(
            modifier = Modifier.weight(1f),
            text = driver.fullName,
            style = Bold16,
            color = black
        )

        Text(
            text = rankText,
            style = Regular14,
            color = gray
        )
    }
}