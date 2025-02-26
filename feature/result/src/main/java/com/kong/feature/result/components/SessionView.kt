package com.kong.feature.result.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.kong.domain.common.Session
import com.kong.feature.core.component.Spacer
import com.kong.feature.core.theme.Bold18
import com.kong.feature.core.theme.Bold24
import com.kong.feature.core.theme.Regular14
import com.kong.feature.core.theme.Regular18
import com.kong.feature.core.theme.black
import com.kong.feature.core.theme.gray
import com.kong.feature.core.theme.lightGray
import com.kong.feature.core.util.DateUtil.toDisplayText

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

            AsyncImage(
                modifier = Modifier.size(70.dp),
                model = session?.circuitImageUrl,
                contentDescription = null
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