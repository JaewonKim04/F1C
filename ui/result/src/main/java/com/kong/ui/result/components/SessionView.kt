package com.kong.ui.result.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kong.common.Session
import com.kong.ui.core.component.Spacer
import com.kong.ui.core.theme.Bold18
import com.kong.ui.core.theme.Bold24
import com.kong.ui.core.theme.Regular14
import com.kong.ui.core.theme.Regular18
import com.kong.ui.core.theme.black
import com.kong.ui.core.theme.gray
import com.kong.ui.core.theme.lightGray
import com.kong.ui.core.util.CountryFlagUtil
import com.kong.ui.core.util.DateUtil.toDisplayText

@Composable
fun SessionView(
    modifier: Modifier = Modifier,
    session: Session?
) {
    Column(modifier = modifier) {
        Text(
            text = "경기결과",
            style = Regular14,
            color = lightGray
        )
        Spacer(dp = 4.dp)
        Row(verticalAlignment = Alignment.CenterVertically) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = session?.grandprixName.orEmpty(),
                    style = Bold24,
                    color = black
                )
                Text(
                    text = session?.sessionType?.displayName.orEmpty(),
                    style = Bold18,
                    color = black
                )
            }

            Text(
                text = CountryFlagUtil.getFlagEmoji(session?.countryName).orEmpty(),
                fontSize = 60.sp
            )
        }

        Spacer(dp = 8.dp)
        Text(
            text = session?.circuitName.orEmpty(),
            style = Regular18,
            color = gray
        )
        Spacer(dp = 5.dp)
        Text(
            text = session?.startDate.toDisplayText().orEmpty(),
            style = Regular18,
            color = gray
        )
    }
}