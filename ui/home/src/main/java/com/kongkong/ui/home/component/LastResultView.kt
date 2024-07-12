package com.kongkong.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.kong.kong.core.theme.white
import com.kongkong.home.model.LastRaceResultSummary
import com.kongkong.ui.home.R

@Composable
fun LastResultView(
    lastRaceResultSummary: LastRaceResultSummary
) {
    Column(
        modifier = Modifier
            .background(color = white, shape = RoundedCornerShape(16.dp))
            .clip(RoundedCornerShape(16.dp))
    ) {
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(40.dp),
                imageVector = ImageVector.vectorResource(R.drawable.img_checkerd_flag),
                contentDescription = null
            )
        }
    }
}