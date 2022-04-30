package com.compose.thomaskunnethbook.ui.presentation

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun Test123()
{
    Text( Return("Hello"))
}

@Composable
fun Return(s: String ) : String{
    return s + " Person!"
}