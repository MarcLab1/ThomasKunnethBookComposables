package com.compose.thomaskunnethbook.ui.presentation

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.thomaskunnethbook.ui.theme.ThomasKunnethBookTheme


@Composable
fun Greeting(name: String = "nobody") {
    Text(text = "Hello $name!")
}

@Composable
fun Hello() {
    val name = remember { mutableStateOf("") }
    val nameEntered = remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment =
            Alignment.CenterHorizontally
        ) {
            Welcome()
            Text(name.value)
            TextAndButton(name, nameEntered)
        }
    }

}

@Composable
fun TextAndButton(
    name: MutableState<String>,
    nameEntered: MutableState<Boolean>
) {
    Row(modifier = Modifier.padding(top = 8.dp)) {

        TextField(
            value = name.value,
            onValueChange = {
                name.value = it
            },
            placeholder = {
                Text(text = "hint")
            },
            modifier = Modifier
                .alignByBaseline()
                .weight(1.0F),
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                autoCorrect = false,
                capitalization = KeyboardCapitalization.Words,
            ),
            keyboardActions = KeyboardActions(onAny = {
                nameEntered.value = true
            })
        )

        Button(modifier = Modifier
            .alignByBaseline()
            .padding(8.dp),
            onClick = {
                nameEntered.value = true
            }) {
            Text(text = "done")
        }
    }
}

@Composable
fun Welcome() {
    Text(
        text = "Welcome",
        style = MaterialTheme.typography.subtitle1
    )
}

@Preview(
    name = "night mode", uiMode = Configuration.UI_MODE_NIGHT_YES,
    group = "night"
)
@Preview(
    name = "light mode", uiMode = Configuration.UI_MODE_NIGHT_NO,
    group = "day"
)

@Composable
private fun HelloPreview() {
    ThomasKunnethBookTheme {
        Hello()
    }
}