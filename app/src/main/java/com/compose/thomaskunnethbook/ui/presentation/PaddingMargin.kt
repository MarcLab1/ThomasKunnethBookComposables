package com.compose.thomaskunnethbook.ui.presentation

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PaddingMargin()
{
    Button(onClick = { /*TODO*/ }, modifier = Modifier
        .background(Color.Blue)
        .padding(30.dp) //margin
        .background(Color.Red)
        .padding(10.dp)) //padding

    {
        Text("some button")
    }
}

@Preview(
    name = "night mode", uiMode = Configuration.UI_MODE_NIGHT_YES,
    group = "group1"
)
@Composable
private fun PaddingMarginPreview() {
  PaddingMargin()

}