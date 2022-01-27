package com.plcoding.androidlibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ScrollableTabRow
import androidx.compose.ui.Modifier
import com.plcoding.androidlibrary.ui.theme.AndroidLibraryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(Modifier.verticalScroll(
                state = ScrollState(1),
                enabled = true,
                flingBehavior = null,
                reverseScrolling = false
            )) {
                StandartCircleMenu()
                RotateCircleMenu()
                ColorAnimateCircleMenu()
                SizeAnimateCircleMenu()
                DifferentButtons()
                AlphaAnimateCircleMenu()
                DubleCircleMenu()
                DifferentDubleCircleMenu()
            }
        }
    }
}
