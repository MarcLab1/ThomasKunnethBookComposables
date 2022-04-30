package com.compose.thomaskunnethbook.ui.presentation

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import com.compose.thomaskunnethbook.model.Item

@SuppressLint("UnrememberedMutableState")
@Composable
fun Obv1() {

    var list: MutableState<MutableList<Item>> = mutableStateOf(mutableListOf())

    var items: MutableList<Item> = mutableListOf()
    (1..5).map { items.add(Item(it.toString(), it)) }
    list.value = items

    Column()
    {
        Button(onClick = {
            var tempList = items
            tempList[0].age += 99
            list.value = tempList

            Log.i("TAG", list.value[0].toString())
        }) {
            Text("modifier old list")
        }

        Button(onClick = {
            var newItems: MutableList<Item> = mutableListOf()
            (11..15).map { newItems.add(Item(it.toString(), it)) }
            list.value = newItems

            Log.i("TAG", list.value.toString())


        }) {
            Text("new list")
        }
        Button(onClick = {
            list.value.removeAt(0)
            list.value.add(Item("tiger", 7473873))
        }) {
            Text("remove from list")
        }

        LazyColumn()
        {
            items(list.value)
            {
                Text(it.toString())
            }
        }
    }
}