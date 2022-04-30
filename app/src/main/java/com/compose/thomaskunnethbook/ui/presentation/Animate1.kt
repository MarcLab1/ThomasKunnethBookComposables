package com.compose.thomaskunnethbook.ui.presentation

import android.text.Layout
import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

@Composable
fun Animate1() {
    var toggled by remember { mutableStateOf(false) }
    var message by remember { mutableStateOf("") }
    val color1 by animateColorAsState(targetValue = if (toggled) MaterialTheme.colors.primary else MaterialTheme.colors.error)
    val color2 by animateColorAsState(
        targetValue = if (!toggled) MaterialTheme.colors.primary else MaterialTheme.colors.error,
        animationSpec = spring<Color>(stiffness = Spring.StiffnessHigh),
        finishedListener = { message = "done like dinner" })

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    )
    {

        Button(onClick = { toggled = !toggled }, modifier = Modifier.padding(10.dp)) {
            Text("button 1")
        }

        Text(message)
        Box(
            modifier = Modifier
                .padding(top = 32.dp)
                .background(color = color1)
                .size(128.dp)
        )
        Box(
            modifier = Modifier
                .padding(top = 32.dp)
                .background(color = color2)
                .size(128.dp)
        )
    }
}

@Composable
fun Animate2() {
    var toggled by remember {
        mutableStateOf(false)
    }
    val transition = updateTransition(targetState = toggled)
    val borderWidth by transition.animateDp() { state ->
        if (state)
            10.dp
        else
            1.dp
    }
    val degrees by transition.animateFloat() { state ->
        if (state) -90F
        else
            0F
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            toggled = !toggled
        }) {
            Text(
                "toggle"
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(top = 32.dp)
                .border(
                    width = borderWidth,
                    color = Color.Black
                )
                .size(128.dp)
        ) {
            Text(
                text = "this app sucks",
                modifier = Modifier.rotate(degrees = degrees)
            )
        }
    }
}


@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Animate3() {

    var visible by remember { mutableStateOf(false) }
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally)
    {
        Button(onClick = { visible = !visible }) {
            Text("toggle")
        }

        AnimatedVisibility(
            visible = visible,
            enter = slideInHorizontally() + fadeIn(),
            exit = slideOutHorizontally() + fadeOut()
        ) {

            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .background(Color.Blue), content = {})

        }
    }
}

@Composable
fun SizeChangeAnimationDemo() {
    var size by remember { mutableStateOf(1F) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Slider(
            value = size,
            valueRange = (1F..4F),
            steps = 3,
            onValueChange = {
                size = it
            },
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = "1 \n2 \n3 \n4 \n5",
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .animateContentSize(animationSpec = snap(2000), finishedListener = null),
            maxLines = size.toInt(),
            color = Color.Blue
        )
    }
}

@Composable
fun CrossfadeAnimationDemo() {
    var isFirstScreen by remember { mutableStateOf(true) }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Switch(
            checked = isFirstScreen,
            onCheckedChange = {
                isFirstScreen = !isFirstScreen
            },
            modifier = Modifier.padding(
                top = 16.dp,
                bottom = 16.dp
            )
        )
        Crossfade(targetState = isFirstScreen) { it ->
            if (it) {
                Screen(
                    text = "WWWW",
                    color = Color.Gray
                )
            } else {
                Screen(
                    text = "III",
                    color = Color.LightGray
                )
            }
        }
    }
}

@Composable
fun Screen(text: String, color: Color) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Text(text)
    }
}
