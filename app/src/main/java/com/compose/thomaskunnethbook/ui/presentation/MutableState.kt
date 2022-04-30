package com.compose.thomaskunnethbook.ui.presentation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@SuppressLint("UnrememberedMutableState")
@Composable
fun MutableState()
{
    var query : MutableState<String> = remember{mutableStateOf("")}

    Column()
    {
        Populate2(query.component1(), query.component2())
    }
}

@Composable
fun Populate(query : MutableState<String>)
{
    Column()
    {
        TextField(value = query.value, onValueChange = { query.value = it})
        Button(onClick = {query.value = "hello" }) {
            Text("click me")
        }
    }
}

@Composable
fun Populate2(query : String, onQueryChange : (String) -> Unit)
{
    Column()
    {
        TextField(value = query, onValueChange = onQueryChange )
    }
}