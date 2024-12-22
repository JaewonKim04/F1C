package com.kong.ui.result.components.item

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.VectorPainter
import androidx.compose.ui.graphics.vector.VectorPath
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.kong.kong.core.R
import com.kong.result.model.DriverResult
import com.kong.ui.core.component.Spacer
import com.kong.ui.core.theme.Bold16
import com.kong.ui.core.theme.Regular12
import com.kong.ui.core.theme.Regular14
import com.kong.ui.core.theme.black
import com.kong.ui.core.theme.getColorFromHexCode
import com.kong.ui.core.theme.gray
import com.kong.ui.core.theme.lightGray
import com.kong.ui.core.util.RankUtil

@Composable
fun DriverResultItem(
    index: Int,
    driverResult: DriverResult
) {
    val driver = remember(driverResult) { driverResult.driver }
    val rankText = remember(index, driverResult) {
        RankUtil.getRankText(
            rankIndex = index,
            isFinishedSession = driverResult.isFinishedSession
        )
    }

    Row(
        modifier = Modifier.padding(vertical = 3.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(width = 5.dp, height = 40.dp)
                .background(
                    color = getColorFromHexCode(driver.teamColorHexCode),
                    shape = RoundedCornerShape(3.dp)
                )
        )

        AsyncImage(
            modifier = Modifier.size(38.dp),
            model = driver.headshotUrl,
            error = painterResource(id = R.drawable.baseline_person_24),
            contentDescription = null
        )

        Spacer(dp = 10.dp)

        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = driver.fullName,
                style = Bold16,
                color = black
            )
            Spacer(dp = 4.dp)
            Text(
                text = driver.teamName,
                style = Regular12,
                color = gray
            )
        }

        Text(
            text = driverResult.timeText.orEmpty(),
            style = Regular14,
            color = lightGray
        )

        Spacer(dp = 4.dp)
        Text(
            text = rankText,
            style = Regular14,
            color = gray
        )
    }
}