package com.example.myanimelist.features.dashboard.presentation.components

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myanimelist.core.components.ImageNetwork
import com.example.myanimelist.core.theme.customShadow
import com.example.myanimelist.ui.theme.black
import com.example.myanimelist.ui.theme.plusJakartaSans
import com.example.myanimelist.ui.theme.white

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun IslandCard(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(white, shape = RoundedCornerShape(8.dp))
//            .customShadow(
//                offsetX = 0.dp,
//                offsetY = 2.dp,
//                shadowBlurRadius = 4.dp,
//                color = Color.Black.copy(alpha = 0.12f)
//            )
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 12.dp, vertical = 10.dp)
                .align(alignment = Alignment.TopStart)
        ) {
            Text(
                text = "Random Recommendation",
                fontFamily = plusJakartaSans,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = black,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Row {
                ImageNetwork(
                    imageUrl = "https://cdn.myanimelist.net/images/anime/1876/141251.jpg",
                    modifier = Modifier
                        .padding(end = 8.dp)
//                        .background(white, shape = RoundedCornerShape(6.dp))
                )
                Column(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "Mushoku Tensei II: Isekai Ittara Honki Dasu Part 2",
                        fontFamily = plusJakartaSans,
                        fontSize = 12.sp,
                        color = black,
                        modifier = Modifier.padding(bottom = 50.dp)
                    )
                }
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.Q)
@Preview(name = "IslandCard")
@Composable
private fun PreviewIslandCard() {
    IslandCard()
}