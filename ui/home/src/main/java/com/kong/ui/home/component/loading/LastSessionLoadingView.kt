package com.kong.ui.home.component.loading

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kong.ui.core.component.ContentLoadingView
import com.kong.ui.core.component.DescriptionLoadingView
import com.kong.ui.core.component.Spacer
import com.kong.ui.core.component.TitleLoadingView
import com.kong.ui.core.theme.Regular14
import com.kong.ui.core.theme.lightGray
import com.kong.ui.core.theme.white

@Composable
fun LastSessionLoadingView() {
    Column(
        modifier = Modifier
            .background(color = white, shape = RoundedCornerShape(16.dp))
            .clip(RoundedCornerShape(16.dp))
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "🏁",
                fontSize = 40.sp
            )
            Spacer(5.dp)
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "지난경기",
                    style = Regular14,
                    color = lightGray
                )
                Spacer(3.dp)
                TitleLoadingView()
                Spacer(3.dp)
                ContentLoadingView()
            }
        }

        Spacer(10.dp)
        repeat(3) {
            Column {
                ContentLoadingView(height = 15.dp)
                Spacer(3.dp)
                DescriptionLoadingView()
                Spacer(dp = 8.dp)
            }
        }
    }
}

@Preview
@Composable
private fun LastResultLoadingViewPreview() {
    LastSessionLoadingView()
}