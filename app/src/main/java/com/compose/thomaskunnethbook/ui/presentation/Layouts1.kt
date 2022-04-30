package com.compose.thomaskunnethbook.ui.presentation

import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun ColumnWithTexts() {
    Column {
        Text(
            text = "Android UI development with Jetpack Compose",
            style = MaterialTheme.typography.h3
        )
        Text(
            text = "Hello Compose",
            style = MaterialTheme
                .typography.h5.merge(TextStyle(color = Color.Red))
        )
        Spacer(modifier = Modifier.padding(top=1.dp))
    }
}

@Preview(
    name = "night mode", group = "1",
)
@Composable
private fun ColumnWithTextsPreview() {
  ColumnWithTexts()
}

@Composable
fun TwoTexts(
    text1: String,
    text2: String,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier.height(IntrinsicSize.Min)) {
        Text(
            modifier = Modifier
                .weight(1f)
                .padding(start = 4.dp)
                .wrapContentWidth(Alignment.Start),
            text = text1
        )

        Divider(
            color = Color.Black,
            modifier = Modifier
                .fillMaxHeight()
                .width(1.dp)
        )
        Text(
            modifier = Modifier
                .weight(1f)
                .padding(end = 4.dp)
                .wrapContentWidth(Alignment.End),
            text = text2,
            style = MaterialTheme.typography.h4
        )
    }
}

@Preview
@Composable
fun TwoTextsPreview() {
    MaterialTheme {
        Surface {
            TwoTexts(text1 = "Hi", text2 = "there")
        }
    }
}
