package com.kong.ui.core.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kong.kong.core.R

@Composable
fun TopBar(
    onClickBack: (() -> Unit)?
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        onClickBack?.let {
            Icon(
                modifier = Modifier
                    .size(35.dp)
                    .clickable { onClickBack() },
                painter = painterResource(id = R.drawable.baseline_chevron_left_24),
                contentDescription = null
            )
        }
    }
}