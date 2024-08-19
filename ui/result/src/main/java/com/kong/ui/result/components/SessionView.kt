package com.kong.ui.result.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kong.common.Session
import com.kong.ui.core.component.Spacer
import com.kong.ui.core.theme.Bold18
import com.kong.ui.core.theme.Bold24
import com.kong.ui.core.theme.Regular14
import com.kong.ui.core.theme.Regular18
import com.kong.ui.core.theme.black
import com.kong.ui.core.theme.gray
import com.kong.ui.core.theme.lightGray
import com.kong.ui.core.util.DateUtil.toDisplayDate

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

        Spacer(dp = 8.dp)
        Text(
            text = session?.circuitName.orEmpty(),
            style = Regular18,
            color = gray
        )
        Spacer(dp = 5.dp)
        Text(
            text = session?.startDate.toDisplayDate().orEmpty(),
            style = Regular18,
            color = gray
        )
    }
}