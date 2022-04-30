package com.compose.thomaskunnethbook.ui.presentation

import android.content.res.Configuration
import androidx.annotation.StringRes
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.MutableLiveData
import com.compose.thomaskunnethbook.ui.theme.ThomasKunnethBookTheme
import com.compose.thomaskunnethbook.R

@Composable
fun ColoredTextDemo(
    text: String = stringResource(id = R.string.app_name),
    color: Color = Color.Blue
) {
    Text(
        text = text,
        style = TextStyle(color = color)
    )
}

@Preview(
    name = "night mode", uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Preview(
    name = "light mode", uiMode = Configuration.UI_MODE_NIGHT_NO,
)

@Composable
private fun ColoredTextDemoPreview() {

    ThomasKunnethBookTheme {
        ColoredTextDemo()
    }
}
