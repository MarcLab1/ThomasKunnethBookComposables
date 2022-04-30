package com.compose.thomaskunnethbook.ui.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun MyPage()
{
    var vm : MyViewModel = viewModel()

    Column()
    {
        Text(vm.x.value.toString())
        Text(vm.y.value.toString())
        MyButton(change = { x,y -> vm.change(x,y)})
    }

}

@Composable
fun MyButton(change:(Int, Int) -> Unit)
{
    Button(onClick = {change(3,4)}) {
        Text("click me")
    }
}