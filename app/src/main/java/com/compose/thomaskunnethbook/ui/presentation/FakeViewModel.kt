package com.compose.thomaskunnethbook.ui.presentation

import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.lifecycle.ViewModel

class FakeViewModel : ViewModel() {

    @Composable
    fun MyText(text: MutableState<String>)
    {
        TextField(value = text.value, onValueChange = {text.value = it})
    }
}