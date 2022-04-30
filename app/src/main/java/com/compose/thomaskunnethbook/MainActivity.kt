package com.compose.thomaskunnethbook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.compose.thomaskunnethbook.ui.presentation.*
import com.compose.thomaskunnethbook.ui.theme.ThomasKunnethBookTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent(parent = null, content = {
            ThomasKunnethBookTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                     NavigationRailDemo()
                }
            }
        })
    }
}

fun isEven(number : Int) : Boolean{
    return number % 2 ==0
}

