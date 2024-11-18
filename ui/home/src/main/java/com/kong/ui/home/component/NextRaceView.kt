package com.kong.ui.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.kong.common.Session
import com.kong.kong.core.R
import com.kong.ui.core.component.Spacer
import com.kong.ui.core.theme.Bold18
import com.kong.ui.core.theme.Bold24
import com.kong.ui.core.theme.Regular14
import com.kong.ui.core.theme.black
import com.kong.ui.core.theme.darkGray
import com.kong.ui.core.theme.lightGray
import com.kong.ui.core.theme.white

@Composable
fun NextRaceView(
    session: Session,
    onClickSession: () -> Unit,
    onClickCalendar: () -> Unit
) {
    Column(
        modifier = Modifier
            .background(color = white, shape = RoundedCornerShape(16.dp))
            .clip(RoundedCornerShape(16.dp))
            .padding(16.dp)
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = "다음경기",
                style = Regular14,
                color = lightGray
            )
            Spacer(3.dp)
            Text(
                text = session.grandprixName,
                style = Bold24,
                color = darkGray
            )
            Spacer(3.dp)
            Text(
                text = session.sessionType.displayName,
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
        Spacer(10.dp)
    }
}