package com.compose.thomaskunnethbook.ui.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun funComposable(vm: MyViewModel = viewModel()) {
    Column {

        Button(onClick = { vm.changeClicked() }, content = { Text("click me") })

        if(vm.clicked.value)
        {
            Text("clicked is true!")
        }
    }
}