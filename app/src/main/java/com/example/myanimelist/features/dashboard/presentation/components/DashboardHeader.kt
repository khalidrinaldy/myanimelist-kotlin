package com.example.myanimelist.features.dashboard.presentation.components

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myanimelist.ui.theme.primary

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun DashboardHeader(
    modifier: Modifier = Modifier
) {
    Box {
        Box(
            modifier
                .height(180.dp)
                .fillMaxWidth()
                .background(
                    primary,
                    shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp)
                )
        ) {
            Text(text = "MyAnimeList", modifier = Modifier.padding(top = 32.dp, start = 12.dp))
        }
        IslandCard(modifier = modifier.align(Alignment.BottomCenter))
    }
}

@RequiresApi(Build.VERSION_CODES.Q)
@Preview(name = "DashboardHeader")
@Composable
private fun PreviewDashboardHeader() {
    DashboardHeader()
}