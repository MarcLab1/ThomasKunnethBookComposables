package com.compose.thomaskunnethbook.ui.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.NonCancellable.isActive
import kotlinx.coroutines.delay

var i = 0

@Composable
fun SideEffect1() {

    Column()
    {
        SideEffect {
            i++
        }
        var key = remember { mutableStateOf(false) }
        Text(i.toString())
        Button(onClick = { key.value = !key.value }) {
            Text(key.value.toString())
        }
    }
}


@Composable
fun LaunchedEffectDemo() {
    var clickCount by remember { mutableStateOf(0) }
    var counter by remember { mutableStateOf(0) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            Button(onClick = {
                clickCount += 1
            }) {
                Text(
                    text = if (clickCount == 0)
                        "start"
                    else
                        "restart"
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(enabled = clickCount > 0,
                onClick = {
                    clickCount = 0
                }) {
                Text(text = "stop")
            }
            if (clickCount > 0) {
                LaunchedEffect(clickCount) {
                    counter = 0
                    while (isActive) {
                        counter += 1
                        delay(1000)
                    }
                }
            }
        }
        Text(
            text = "$counter",
            style = MaterialTheme.typography.h3
        )
    }
}

