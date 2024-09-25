package com.kong.ui.home.component.loading

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kong.ui.core.component.Spacer
import com.kong.ui.core.theme.Regular14
import com.kong.ui.core.theme.lightGray
import com.kong.ui.core.theme.white
import com.valentinilk.shimmer.shimmer

@Composable
fun LastResultLoadingView() {
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
                Box(
                    modifier = Modifier
                        .shimmer()
                        .background(lightGray)
                        .size(width = 150.dp, height = 40.dp)
                )
                Spacer(3.dp)
                Box(
                    modifier = Modifier
                        .shimmer()
                        .background(lightGray)
                        .size(width = 100.dp, height = 20.dp)
                )
            }
        }

        Spacer(10.dp)
        repeat(3) {
            Column {
                Box(
                    modifier = Modifier
                        .shimmer()
                        .background(lightGray)
                        .size(width = 100.dp, height = 15.dp)
                )
                Spacer(3.dp)
                Box(
                    modifier = Modifier
                        .shimmer()
                        .background(lightGray)
                        .size(width = 80.dp, height = 10.dp)
                )
                Spacer(dp = 8.dp)
            }
        }
    }
}

@Preview
@Composable
private fun LastResultLoadingViewPreview() {
    LastResultLoadingView()
}