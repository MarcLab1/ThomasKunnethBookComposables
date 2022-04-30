package com.compose.thomaskunnethbook.ui.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.compose.thomaskunnethbook.R

@Composable
fun NavigationRailDemo() {
    val showNavigationRail = LocalConfiguration.current.screenWidthDp >= 600
    val index = rememberSaveable { mutableStateOf(0) }
    Scaffold(topBar = {
        TopAppBar(title = {
            Text(text = stringResource(id = R.string.app_name))
        })
    },
        bottomBar = {
            if (!showNavigationRail)
                BottomBar(index)

        }) {
        Content(showNavigationRail, index)
    }
}

@Composable
fun BottomBar(index: MutableState<Int>) {
    BottomNavigation {
        for (i in 0..2)
            BottomNavigationItem(selected = i == index.value,
                onClick = { index.value = i },
                icon = {
                    Icon(
                        painter = painterResource(
                            id =
                            R.drawable.ic_launcher_background
                        ),
                        contentDescription = null
                    )
                },
                label = {
                   Text(index.toString())
                }
            )
    }
}

@Composable
fun Content(
    showNavigationRail: Boolean, index:
    MutableState<Int>
) {
    Row(
        modifier = Modifier.fillMaxSize()
    ) {
        if (showNavigationRail) {
            NavigationRail {
                for (i in 0..2)
                    NavigationRailItem(selected = i == index.value,
                        onClick = {
                            index.value = i
                        },
                        icon = {
                            Icon(
                                painter = painterResource(
                                    id =
                                    R.drawable.ic_launcher_background
                                ),
                                contentDescription = null
                            )
                        },
                        label = {
                            Text(index.toString())
                        })
            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colors.surface),
            contentAlignment = Alignment.Center
        ) {
            Text(index.toString())

        }
    }
}