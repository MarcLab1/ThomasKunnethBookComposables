package com.compose.thomaskunnethbook.ui.presentation

import android.graphics.Color
import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Red

@Composable
fun Weight()
{
    Row(modifier = Modifier.fillMaxWidth())
    {
        Column(modifier = Modifier.weight(0.3f).fillMaxWidth() .background(MaterialTheme.colors.secondary))
        {
            Text("32324324", modifier = Modifier)
        }
        Column(modifier = Modifier.weight(0.7f).fillMaxWidth() .background(MaterialTheme.colors.secondaryVariant))
        {
            Text("32324324")
        }

    }
}