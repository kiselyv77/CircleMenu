package com.plcoding.circle_menu

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.*
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlin.math.cos
import kotlin.math.sin

class BottonCircle(
    val imageVector: ImageVector,
    val bottonSpec:CircleMenuButtonSpec = CircleMenuButtonSpec(),
    val onClick: () -> Unit
)
class MainButtonCircle(
    val imageVector: ImageVector,
    val bottonSpec:CircleMenuMainButtonSpec = CircleMenuMainButtonSpec(),
    val onClick: () -> Unit
)

class RotateButtonSpec(
    val openValue: Float = 0.0f,
    val closeValue: Float = 0.0f,
    val animationSpec: AnimationSpec<Float> = tween(durationMillis = 500, easing = FastOutSlowInEasing),

    )

class RadiusButtonSpec(
    val openValue: Float = 100.0f,
    val closeValue: Float = 0.0f,
    val animationSpec: AnimationSpec<Float> = tween(durationMillis = 500, easing = FastOutSlowInEasing),

    )

class AlphaButtonSpec(
    val openValue: Float = 1.0f,
    val closeValue: Float = 0.0f,
    val animationSpec: AnimationSpec<Float> = tween(durationMillis = 500, easing = FastOutSlowInEasing),

    )

class SizeButtonSpec(
    val openValue: Dp = 30.dp,
    val closeValue: Dp = 0.0.dp,
    val animationSpec: AnimationSpec<Dp> = tween(durationMillis = 500, easing = FastOutSlowInEasing),
)

class ColorButtonSpec(
    val openValue: Color = Color.Black,
    val closeValue: Color = Color.Black,
    val animationSpec: AnimationSpec<Color> = tween(durationMillis = 500, easing = FastOutSlowInEasing),
)


data class CircleMenuButtonSpec(
    val rotate:RotateButtonSpec = RotateButtonSpec(),
    val radius:RadiusButtonSpec = RadiusButtonSpec(),
    val alpha:AlphaButtonSpec = AlphaButtonSpec(),
    val size:SizeButtonSpec = SizeButtonSpec(),
    val color:ColorButtonSpec = ColorButtonSpec(),
    val closeOnClick:Boolean = false
)

class CircleMenuMainButtonSpec(
    val rotate:RotateButtonSpec = RotateButtonSpec(),
    val alpha:AlphaButtonSpec = AlphaButtonSpec(openValue = 1f, closeValue = 1f),
    val size:SizeButtonSpec = SizeButtonSpec(openValue = 30.dp, closeValue = 30.dp),
    val color:ColorButtonSpec = ColorButtonSpec(),
)


@Composable
fun CircleMenu(
    modifier: Modifier = Modifier,
    mainBotton:MainButtonCircle,
    buttons:List<BottonCircle> = arrayListOf(),
){
    val listSize = buttons.size
    val listAngle = 0.rangeTo(listSize-1).toList()

    val isOpen = remember { mutableStateOf(value = false) }


    val alphaMainBotton: Float by animateFloatAsState(
        targetValue = if (isOpen.value) mainBotton.bottonSpec.alpha.openValue else mainBotton.bottonSpec.alpha.closeValue,
        animationSpec = mainBotton.bottonSpec.alpha.animationSpec
    )

    val rotateMainBotton: Float by animateFloatAsState(
        targetValue = if (isOpen.value) mainBotton.bottonSpec.rotate.openValue else mainBotton.bottonSpec.rotate.closeValue,
        animationSpec = mainBotton.bottonSpec.rotate.animationSpec
    )

    val sizeMainBotton by animateDpAsState(
        targetValue = if (isOpen.value) mainBotton.bottonSpec.size.openValue else mainBotton.bottonSpec.size.closeValue,
        animationSpec = mainBotton.bottonSpec.size.animationSpec
    )

    val colorMainBotton by animateColorAsState(
        targetValue = if (isOpen.value) mainBotton.bottonSpec.color.openValue else mainBotton.bottonSpec.color.closeValue,
        animationSpec = mainBotton.bottonSpec.color.animationSpec
    )
    val listRadius = mutableListOf<Float>()
    buttons.forEach {
        listRadius.add(it.bottonSpec.radius.openValue)
    }
    val listSizes = mutableListOf<Dp>()
    buttons.forEach {
        listSizes.add(it.bottonSpec.size.openValue)
    }

    val maxRadius = listRadius.maxOrNull() ?: 0f
    val maxSize = listSizes.maxOrNull() ?: 0.dp

    val swipeRotateOffset = remember {
        mutableStateOf(0.0f)
    }

    Box(
        modifier = modifier
            .width(maxRadius.dp * 2 + maxSize)
            .height(maxRadius.dp * 2 + maxSize),
        contentAlignment = Alignment.Center
    ){
        IconButton(
            modifier = Modifier.rotate(rotateMainBotton),
            onClick = {isOpen.value = !isOpen.value}
        ) {
            Image(imageVector = mainBotton.imageVector,
                contentDescription = null,
                modifier = Modifier
                    .size(sizeMainBotton)
                    .alpha(alphaMainBotton),
                colorFilter = ColorFilter.tint(colorMainBotton)
            )

        }
        Box(){
            listAngle.forEach{
                val radius: Float by animateFloatAsState(
                    targetValue = if (isOpen.value) buttons[it].bottonSpec.radius.openValue else buttons[it].bottonSpec.radius.closeValue,
                    animationSpec = buttons[it].bottonSpec.radius.animationSpec
                )
                val size by animateDpAsState(
                    targetValue = if (isOpen.value) buttons[it].bottonSpec.size.openValue else buttons[it].bottonSpec.size.closeValue,
                    animationSpec = buttons[it].bottonSpec.size.animationSpec
                )
                val alpha: Float by animateFloatAsState(
                    targetValue = if (isOpen.value) buttons[it].bottonSpec.alpha.openValue else buttons[it].bottonSpec.alpha.closeValue,
                    animationSpec = buttons[it].bottonSpec.alpha.animationSpec
                )
                val rotate: Float by animateFloatAsState(
                    targetValue = if (isOpen.value) buttons[it].bottonSpec.rotate.openValue else buttons[it].bottonSpec.rotate.closeValue,
                    animationSpec = buttons[it].bottonSpec.rotate.animationSpec
                )
                val color: Color by animateColorAsState(
                    targetValue = if (isOpen.value) buttons[it].bottonSpec.color.openValue else buttons[it].bottonSpec.color.closeValue,
                    animationSpec = buttons[it].bottonSpec.color.animationSpec
                )
                val x = cos(2 * Math.PI * (it + rotate/45) / listSize-1 + swipeRotateOffset.value/100) * radius
                val y = sin(2 * Math.PI * (it + rotate/45) / listSize-1 + swipeRotateOffset.value/100) * radius

                val enabled = if (isOpen.value == true) {true} else false
                IconButton(
                    modifier = Modifier
                        .offset(x = x.dp, y = y.dp)
                        .size(size),
                    onClick = {
                        buttons[it].onClick()
                        if(buttons[it].bottonSpec.closeOnClick == true) isOpen.value = false
                    },
                    enabled = enabled
                ) {

                    Box(modifier = Modifier) {
                        Image(imageVector = buttons[it].imageVector,
                            contentDescription = null,
                            modifier = Modifier
                                .size(size)
                                .alpha(alpha),
                            colorFilter = ColorFilter.tint(color)
                        )
                    }
                }
            }
        }
    }
}