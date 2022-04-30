package com.compose.thomaskunnethbook.ui.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*

@Composable
fun FakePage() {
    var buttonState by remember { mutableStateOf("nothing") }
    val buttonState2 = remember { mutableStateOf("nada")}

    Column()
    {
        //BuildButtons(clickHandler = { item -> buttonState = item })
        BuildButtons2(state = buttonState2)
        Status(name = buttonState2.value)
    }
}

@Composable
fun BuildButtons(clickHandler: (String) -> Unit) {
    val myList = listOf("One", "Two", "Three")

    for (item in myList) {
        MyButton(item, clickHandler = { clickHandler(item) })
    }
}
@Composable
fun BuildButtons2(state : MutableState<String> ) {
    val myList = listOf("One", "Two", "Three")

    for (item in myList) {
        MyButton(item, clickHandler = { state.value = item })
    }
}
@Composable
fun Status(name: String) {
    Text(text = "Hello, $name!")
}

@Composable
fun MyButton(text: String, clickHandler: () -> Unit) {
    Button(
        onClick = clickHandler
    ) {
        Text(text)
    }
}