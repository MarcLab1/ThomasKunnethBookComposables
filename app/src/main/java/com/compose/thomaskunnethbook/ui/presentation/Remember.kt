package com.compose.thomaskunnethbook.ui.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import java.util.*

@Composable
@Preview
fun RememberWithKeyDemo() {
    var key by remember { mutableStateOf(false) }
    val date by remember(key) { mutableStateOf(Date()) }
    Column(horizontalAlignment =
    Alignment.CenterHorizontally) {
        Text(date.toString())
        Button(onClick = { key = !key }) {
            Text(text = "clickyy")
        }
    }
}