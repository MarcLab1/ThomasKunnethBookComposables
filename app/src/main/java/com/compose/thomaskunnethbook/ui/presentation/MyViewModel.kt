package com.compose.thomaskunnethbook.ui.presentation

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    var x = mutableStateOf(0)
    var y = mutableStateOf(0)
    var clicked = mutableStateOf(false)

    fun change(newX: Int, newY: Int) : Unit{
        x.value += newX
        y.value += newY
    }

    fun changeClicked()
    {
        clicked.value = !clicked.value
    }
}