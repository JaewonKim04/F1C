package com.kong.ui.result.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun SessionView(session: Session) {
    Column {
        Text(
            text = "경기결과",
            style = Regular14,
            color = lightGray
        )
        Spacer(dp = 4.dp)
        Text(
            text = session.grandprixName,
            style = Bold24,
            color = black
        )
        Text(
            text = session.sessionName,
            style = Bold18,
            color = black
        )

        Spacer(dp = 8.dp)
        Text(
            text = session.circuitName,
            style = Regular18,
            color = gray
        )
        Spacer(dp = 5.dp)
        Text(
            text = session.startDate.toDisplayDate(),
            style = Regular18,
            color = gray
        )
    }
}