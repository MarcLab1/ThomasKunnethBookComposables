package com.compose.thomaskunnethbook.ui.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun BoxDemo() {
    Box(contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .size(width = 100.dp, height = 100.dp)
                .background(Color.Green)
        )
        Box(
            modifier = Modifier
                .size(width = 80.dp, height = 80.dp)
                .background(Color.Yellow)
        )
        Text(
            text = "Hello",
            color = Color.Black,
            modifier = Modifier.align(Alignment.TopStart)
        )
    }
}