package com.compose.thomaskunnethbook.ui.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import kotlin.random.Random

@Composable
fun Recomposition() {
    var value by remember { mutableStateOf(0)}
    var value2 by remember { mutableStateOf(Random.nextInt(0,88))}

    Box(contentAlignment = Alignment.Center)
    {
        Column()
        {
            Text("stays the same")
            Text(Random.nextInt(0,10).toString())
            Text(value.toString())
            Text("also stays the same = $value2.toString()")
            Button(onClick = { value += 1 }) {
                Text("click me")
            }
        }
    }
}