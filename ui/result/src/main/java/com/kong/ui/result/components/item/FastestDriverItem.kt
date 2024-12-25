package com.kong.ui.result.components.item

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.kong.common.Driver
import com.kong.kong.core.R
import com.kong.result.model.DriverResult
import com.kong.ui.core.component.Spacer
import com.kong.ui.core.theme.Bold18
import com.kong.ui.core.theme.Regular12
import com.kong.ui.core.theme.Regular16
import com.kong.ui.core.theme.black
import com.kong.ui.core.theme.fastestLapColor
import com.kong.ui.core.theme.getColorFromHexCode
import com.kong.ui.core.theme.gray

@Composable
fun FastestDriverItem(
    isFastestDriver: Boolean,
    driverResult: DriverResult
) {
    val driver = remember(driverResult) {
        driverResult.driver
    }
    Column {
        Spacer(dp = 7.dp)
        Row(
            modifier = Modifier.padding(vertical = 3.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(width = 7.dp, height = 30.dp)
                            .background(
                                color = getColorFromHexCode(driver.teamColorHexCode),
                                shape = RoundedCornerShape(3.dp)
                            )
                    )
                    Spacer(dp = 5.dp)

                    Text(
                        text = driver.fullName,
                        style = Bold18,
                        color = black
                    )
                    Spacer(dp = 4.dp)
                    Text(
                        text = driver.teamName,
                        style = Regular12,
                        color = gray
                    )
                }
                Spacer(dp = 5.dp)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = driverResult.timeText.orEmpty(),
                        style = Regular16,
                        color = gray
                    )
                    if (isFastestDriver) {
                        Spacer(dp = 3.dp)
                        Icon(
                            modifier = Modifier.size(20.dp),
                            painter = painterResource(id = R.drawable.baseline_access_time_24),
                            tint = fastestLapColor,
                            contentDescription = null
                        )
                    }
                }
            }

            AsyncImage(
                modifier = Modifier.size(45.dp),
                model = driver.headshotUrl,
                error = painterResource(id = R.drawable.baseline_person_24),
                contentDescription = null
            )
        }
        Spacer(dp = 7.dp)
        HorizontalDivider()
    }
}

@Preview(showBackground = true)
@Composable
private fun FastestDriverItem_Preview() {
    FastestDriverItem(
        driverResult = DriverResult(
            driver = Driver(
                fullName = "막스 베르스타펜",
                broadcastName = "VER",
                headshotUrl = "",
                teamName = "RedBull",
                teamColorHexCode = "#000000"
            ),
            timeText = "1.32.121",
            isFinishedSession = true
        ),
        isFastestDriver = true
    )
}
