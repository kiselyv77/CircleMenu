package com.plcoding.androidlibrary

import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.plcoding.circle_menu.*

@Composable
fun StandartCircleMenu(){
    Box(Modifier.fillMaxSize().padding(bottom = 40.dp) , contentAlignment = Alignment.Center){
        CircleMenu(
            mainBotton = MainButtonCircle(imageVector = Icons.Default.Menu, onClick = {}),
            buttons = listOf(
                BottonCircle(imageVector = Icons.Default.Favorite, onClick = {}),
                BottonCircle(imageVector = Icons.Default.Star, onClick = {}),
                BottonCircle(imageVector = Icons.Default.Build, onClick = {}),
                BottonCircle(imageVector = Icons.Default.AccountBox, onClick = {}),
                BottonCircle(imageVector = Icons.Default.Call, onClick = {}),
                BottonCircle(imageVector = Icons.Default.Settings, onClick = {}),
                BottonCircle(imageVector = Icons.Default.Home, onClick = {}),
            )
        )
    }
}

@Composable
fun RotateCircleMenu(){
    val buttonSpec = CircleMenuButtonSpec(
        rotate = RotateButtonSpec(
            openValue = 180f,
            closeValue = 0f,
            animationSpec = tween(durationMillis = 500)
        )
    )
    val mainButtonSpec = CircleMenuMainButtonSpec(
        rotate = RotateButtonSpec(
            openValue = 180f,
            closeValue = 0f,
            animationSpec = tween(durationMillis = 500)
        )
    )
    Box(Modifier.fillMaxSize().padding(bottom = 40.dp) , contentAlignment = Alignment.Center){
        CircleMenu(
            mainBotton = MainButtonCircle(imageVector = Icons.Default.Menu, onClick = {}, bottonSpec = mainButtonSpec),
            buttons = listOf(
                BottonCircle(imageVector = Icons.Default.Favorite, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.Star, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.Build, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.AccountBox, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.Call, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.Settings, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.Home, onClick = {}, bottonSpec = buttonSpec),
            )
        )
    }
}

@Composable
fun ColorAnimateCircleMenu(){
    val buttonSpec = CircleMenuButtonSpec(
        color = ColorButtonSpec(
            openValue = Color.Magenta,
            closeValue = Color.Black,
            animationSpec = tween(durationMillis = 500)
        )
    )
    val mainButtonSpec = CircleMenuMainButtonSpec(
        color = ColorButtonSpec(
            openValue = Color.Magenta,
            closeValue = Color.Black,
            animationSpec = tween(durationMillis = 500)
        )
    )
    Box(Modifier.fillMaxSize().padding(bottom = 40.dp) , contentAlignment = Alignment.Center){
        CircleMenu(
            mainBotton = MainButtonCircle(imageVector = Icons.Default.Menu, onClick = {}, bottonSpec = mainButtonSpec),
            buttons = listOf(
                BottonCircle(imageVector = Icons.Default.Favorite, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.Star, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.Build, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.AccountBox, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.Call, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.Settings, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.Home, onClick = {}, bottonSpec = buttonSpec),
            )
        )
    }
}

@Composable
fun SizeAnimateCircleMenu(){
    val buttonSpec = CircleMenuButtonSpec(
        size = SizeButtonSpec(
            openValue = 50.dp,
            closeValue = 0.dp,
            animationSpec = tween(durationMillis = 500)
        ),
        radius = RadiusButtonSpec(100f, 100f)
    )
    val mainButtonSpec = CircleMenuMainButtonSpec(
        size = SizeButtonSpec(
            openValue = 50.dp,
            closeValue = 30.dp,
            animationSpec = tween(durationMillis = 500)
        )
    )
    Box(Modifier.fillMaxSize().padding(bottom = 40.dp) , contentAlignment = Alignment.Center){
        CircleMenu(
            mainBotton = MainButtonCircle(imageVector = Icons.Default.Menu, onClick = {}, bottonSpec = mainButtonSpec),
            buttons = listOf(
                BottonCircle(imageVector = Icons.Default.Favorite, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.Star, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.Build, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.AccountBox, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.Call, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.Settings, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.Home, onClick = {}, bottonSpec = buttonSpec),
            )
        )
    }
}

@Composable
fun DifferentButtons(){
    val buttonSpec = CircleMenuButtonSpec(
        size = SizeButtonSpec(
            openValue = 50.dp,
            closeValue = 0.dp,
            animationSpec = tween(durationMillis = 500)
        ),
        radius = RadiusButtonSpec(100f, 120f)
    )
    val mainButtonSpec = CircleMenuMainButtonSpec(
        size = SizeButtonSpec(
            openValue = 60.dp,
            closeValue = 30.dp,
            animationSpec = tween(durationMillis = 500)
        ),
        color = ColorButtonSpec(openValue = Color.DarkGray)
    )
    Box(Modifier.fillMaxSize().padding(bottom = 40.dp) , contentAlignment = Alignment.Center){
        CircleMenu(
            mainBotton = MainButtonCircle(imageVector = Icons.Default.Menu, onClick = {}, bottonSpec = mainButtonSpec),
            buttons = listOf(
                BottonCircle(
                    imageVector = Icons.Default.Favorite,
                    onClick = {},
                    bottonSpec = buttonSpec.copy(
                        color = ColorButtonSpec(openValue = Color.Yellow)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.Star,
                    onClick = {},
                    bottonSpec = buttonSpec.copy(
                        color = ColorButtonSpec(openValue = Color.Green)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.Build, onClick = {},
                    bottonSpec = buttonSpec.copy(
                        color = ColorButtonSpec(openValue = Color.Gray)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.AccountBox,
                    onClick = {}, bottonSpec = buttonSpec.copy(
                        color = ColorButtonSpec(openValue = Color.Blue)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.Call,
                    onClick = {},
                    bottonSpec = buttonSpec.copy(
                        color = ColorButtonSpec(openValue = Color.Cyan)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.Settings,
                    onClick = {},
                    bottonSpec = buttonSpec.copy(
                        color = ColorButtonSpec(openValue = Color.Magenta)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.Home,
                    onClick = {},
                    bottonSpec = buttonSpec.copy(
                        color = ColorButtonSpec(openValue = Color.Red)
                    )
                ),
            )
        )
    }
}

@Composable
fun AlphaAnimateCircleMenu(){
    val buttonSpec = CircleMenuButtonSpec(
        size = SizeButtonSpec(
            openValue = 50.dp,
            closeValue = 50.dp,
            animationSpec = tween(durationMillis = 500)
        ),
        radius = RadiusButtonSpec(100f, 100f),
        alpha = AlphaButtonSpec(1f,0f, tween(durationMillis = 300))
    )
    val mainButtonSpec = CircleMenuMainButtonSpec(
        size = SizeButtonSpec(
            openValue = 40.dp,
            closeValue = 40.dp,
            animationSpec = tween(durationMillis = 500)
        )
    )
    Box(Modifier.fillMaxSize().padding(bottom = 40.dp) , contentAlignment = Alignment.Center){
        CircleMenu(
            mainBotton = MainButtonCircle(imageVector = Icons.Default.Menu, onClick = {}, bottonSpec = mainButtonSpec),
            buttons = listOf(
                BottonCircle(imageVector = Icons.Default.Favorite, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.Star, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.Build, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.AccountBox, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.Call, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.Settings, onClick = {}, bottonSpec = buttonSpec),
                BottonCircle(imageVector = Icons.Default.Home, onClick = {}, bottonSpec = buttonSpec),
            )
        )
    }

}

@Composable
fun DubleCircleMenu(){
    val buttonSpec1 = CircleMenuButtonSpec(
        size = SizeButtonSpec(
            openValue = 40.dp,
            closeValue = 0.dp,
            animationSpec = tween(durationMillis = 500)
        ),
        rotate = RotateButtonSpec(openValue = 180f),
        radius = RadiusButtonSpec(100f, 0f)
    )
    val buttonSpec2 = CircleMenuButtonSpec(
        size = SizeButtonSpec(
            openValue = 40.dp,
            closeValue = 0.dp,
            animationSpec = tween(durationMillis = 500)
        ),
        rotate = RotateButtonSpec(openValue = -180f),
        radius = RadiusButtonSpec(50f, 0f)
    )
    val mainButtonSpec = CircleMenuMainButtonSpec(
        size = SizeButtonSpec(
            openValue =40.dp,
            closeValue = 30.dp,
            animationSpec = tween(durationMillis = 500)
        ),
        color = ColorButtonSpec(openValue = Color.DarkGray)
    )
    Box(Modifier.fillMaxSize().padding(bottom = 40.dp) , contentAlignment = Alignment.Center){
        CircleMenu(
            mainBotton = MainButtonCircle(imageVector = Icons.Default.Menu, onClick = {}, bottonSpec = mainButtonSpec),
            buttons = listOf(
                BottonCircle(
                    imageVector = Icons.Default.Favorite,
                    onClick = {},
                    bottonSpec = buttonSpec1.copy(
                        color = ColorButtonSpec(openValue = Color.Blue))),
                BottonCircle(
                    imageVector = Icons.Default.Settings,
                    onClick = {}, bottonSpec = buttonSpec2.copy(
                        color = ColorButtonSpec(openValue = Color.DarkGray)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.Star,
                    onClick = {}, bottonSpec = buttonSpec1.copy(
                        color = ColorButtonSpec(openValue = Color.Yellow)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.Star,
                    onClick = {}, bottonSpec = buttonSpec2.copy(
                        color = ColorButtonSpec(openValue = Color.Magenta)
                    )
                ),
                BottonCircle(imageVector = Icons.Default.Call,
                    onClick = {}, bottonSpec = buttonSpec1.copy(
                        color = ColorButtonSpec(openValue = Color.Cyan)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.Favorite,
                    onClick = {},
                    bottonSpec = buttonSpec2.copy(
                        color = ColorButtonSpec(openValue = Color.Blue)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.Build,
                    onClick = {},
                    bottonSpec = buttonSpec1.copy(
                        color = ColorButtonSpec(openValue = Color.Red)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.Build,
                    onClick = {},
                    bottonSpec = buttonSpec2.copy(
                        color = ColorButtonSpec(openValue = Color.Gray)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.AccountBox,
                    onClick = {},
                    bottonSpec = buttonSpec1.copy(
                        color = ColorButtonSpec(openValue = Color.Yellow)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.Settings,
                    onClick = {},
                    bottonSpec = buttonSpec2.copy(
                        color = ColorButtonSpec(openValue = Color.Magenta)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.Home,
                    onClick = {},
                    bottonSpec = buttonSpec1.copy(
                        color = ColorButtonSpec(openValue = Color.Black)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.AccountBox,
                    onClick = {},
                    bottonSpec = buttonSpec2.copy(
                        color = ColorButtonSpec(openValue = Color.Green)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.Call,
                    onClick = {},
                    bottonSpec = buttonSpec1.copy(
                        color = ColorButtonSpec(openValue = Color.Red)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.Home,
                    onClick = {},
                    bottonSpec = buttonSpec2.copy(
                        color = ColorButtonSpec(openValue = Color.Magenta)
                    )
                ),
            )

        )
    }
}

@Composable
fun DifferentDubleCircleMenu(){
    val buttonSpec1 = CircleMenuButtonSpec(
        size = SizeButtonSpec(
            openValue = 30.dp,
            closeValue = 0.dp,
            animationSpec = tween(durationMillis = 800)
        ),
        alpha = AlphaButtonSpec(animationSpec = tween(durationMillis = 800)),
        radius = RadiusButtonSpec(150f, 0f, animationSpec = tween(durationMillis = 800))
    )

    val buttonSpec2 = CircleMenuButtonSpec(
        size = SizeButtonSpec(
            openValue = 30.dp,
            closeValue = 0.dp,
            animationSpec = tween(durationMillis = 300)
        ),
        alpha = AlphaButtonSpec(animationSpec = tween(durationMillis = 300)),

        radius = RadiusButtonSpec(100f, 0f, animationSpec = tween(durationMillis = 300))
    )

    val mainButtonSpec = CircleMenuMainButtonSpec(
        size = SizeButtonSpec(
            openValue =40.dp,
            closeValue = 30.dp,
            animationSpec = tween(durationMillis = 300)
        ),
        alpha = AlphaButtonSpec(1f, 1f, animationSpec = tween(durationMillis = 300)),
        color = ColorButtonSpec(openValue = Color.DarkGray)
    )
    Box(Modifier.fillMaxSize().padding(bottom = 40.dp) , contentAlignment = Alignment.Center){
        CircleMenu(
            mainBotton = MainButtonCircle(imageVector = Icons.Default.Menu, onClick = {}, bottonSpec = mainButtonSpec),
            buttons = listOf(
                BottonCircle(
                    imageVector = Icons.Default.Favorite,
                    onClick = {},
                    bottonSpec = buttonSpec1.copy(
                        color = ColorButtonSpec(openValue = Color.Blue))),
                BottonCircle(
                    imageVector = Icons.Default.Settings,
                    onClick = {}, bottonSpec = buttonSpec2.copy(
                        color = ColorButtonSpec(openValue = Color.DarkGray)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.Star,
                    onClick = {}, bottonSpec = buttonSpec1.copy(
                        color = ColorButtonSpec(openValue = Color.Yellow)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.Star,
                    onClick = {}, bottonSpec = buttonSpec2.copy(
                        color = ColorButtonSpec(openValue = Color.Magenta)
                    )
                ),
                BottonCircle(imageVector = Icons.Default.Call,
                    onClick = {}, bottonSpec = buttonSpec1.copy(
                        color = ColorButtonSpec(openValue = Color.Cyan)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.Favorite,
                    onClick = {},
                    bottonSpec = buttonSpec2.copy(
                        color = ColorButtonSpec(openValue = Color.Blue)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.Build,
                    onClick = {},
                    bottonSpec = buttonSpec1.copy(
                        color = ColorButtonSpec(openValue = Color.Red)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.Build,
                    onClick = {},
                    bottonSpec = buttonSpec2.copy(
                        color = ColorButtonSpec(openValue = Color.Gray)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.AccountBox,
                    onClick = {},
                    bottonSpec = buttonSpec1.copy(
                        color = ColorButtonSpec(openValue = Color.Yellow)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.Settings,
                    onClick = {},
                    bottonSpec = buttonSpec2.copy(
                        color = ColorButtonSpec(openValue = Color.Magenta)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.Home,
                    onClick = {},
                    bottonSpec = buttonSpec1.copy(
                        color = ColorButtonSpec(openValue = Color.Black)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.AccountBox,
                    onClick = {},
                    bottonSpec = buttonSpec2.copy(
                        color = ColorButtonSpec(openValue = Color.Green)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.Call,
                    onClick = {},
                    bottonSpec = buttonSpec1.copy(
                        color = ColorButtonSpec(openValue = Color.Red)
                    )
                ),
                BottonCircle(
                    imageVector = Icons.Default.Home,
                    onClick = {},
                    bottonSpec = buttonSpec2.copy(
                        color = ColorButtonSpec(openValue = Color.Magenta)
                    )
                ),
            )

        )
    }
}