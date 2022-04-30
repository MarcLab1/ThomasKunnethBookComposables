package com.compose.thomaskunnethbook.ui.presentation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable

@Composable
fun MyScaffold() {
    Scaffold(
        scaffoldState = rememberScaffoldState(),
        bottomBar = {
            BottomNavigation() {

            }
        })
    {

    }
}