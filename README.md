<p align="center">
 <img width="200px" src="https://github.com/kiselyv77/CircleMenu/blob/master/gif/standart.gif"align="center"/>
 <h2 align="center">Circular menu for Jetpack Compose.</h2>
 <p align="center"><b>Having many settings for animation.</b></p>
</p>

Gradle
------
gradle.settings
```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        jcenter() // Warning: this repository is going to shut down soon
        maven { url 'https://jitpack.io' }
    }
}
```
gradle.app
```gradle
dependencies {
implementation 'com.github.kiselyv77:CircleMenu:V1.0'
}
```
Usage
------
circle menu

<img src="https://github.com/kiselyv77/CircleMenu/blob/master/gif/standart.gif" width="20%" height="20%" align="right" />

```kotlin
val buttonSpec = CircleMenuButtonSpec()
val mainButtonSpec = CircleMenuMainButtonSpec()

Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        CircleMenu(
            mainBotton = MainButtonCircle(
                imageVector = Icons.Default.Menu, 
                onClick = {}, 
                buttonsSpec = mainButtonSpec
              ),
            buttons = listOf(
                BottonCircle(imageVector = Icons.Default.Favorite, onClick = {}, buttonSpec),
                BottonCircle(imageVector = Icons.Default.Star, onClick = {}, buttonSpec),
                BottonCircle(imageVector = Icons.Default.Build, onClick = {}, buttonSpec),
                BottonCircle(imageVector = Icons.Default.AccountBox, onClick = {}, buttonSpec),
                BottonCircle(imageVector = Icons.Default.Call, onClick = {}, buttonSpec),
                BottonCircle(imageVector = Icons.Default.Settings, onClick = {}, buttonSpec),
                BottonCircle(imageVector = Icons.Default.Home, onClick = {}, buttonSpec),
            )
        )
    }
```

add rotate circle menu

<img src="https://github.com/kiselyv77/CircleMenu/blob/master/gif/rotate.gif" width="20%" height="20%" align="right" />

```kotlin
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
```

add color animate circle menu

<img src="https://github.com/kiselyv77/CircleMenu/blob/master/gif/color.gif" width="20%" height="20%" align="right" />

```kotlin
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
```

use buttonSpec.copy() to create different buttons

<img src="https://github.com/kiselyv77/CircleMenu/blob/master/gif/different.gif" width="20%" height="20%" align="right" />

```kotlin

    val buttonSpec = CircleMenuButtonSpec(
        size = SizeButtonSpec(
            openValue = 50.dp,
            closeValue = 0.dp,
            animationSpec = tween(durationMillis = 500)
        ),
        radius = RadiusButtonSpec(100f, 120f)
    )
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        CircleMenu(
                mainBotton = MainButtonCircle(
                imageVector = Icons.Default.Menu, 
                onClick = {}
            ),
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
                    )
            )  
```

you can combine settings and achieve different results

<body>
  <p>
        <img src="https://github.com/kiselyv77/CircleMenu/blob/master/gif/duble.gif" width="20%" height="20%" align="left" />
        <img src="https://github.com/kiselyv77/CircleMenu/blob/master/gif/duble2.gif" width="20%" height="20%" align="left" />
  </p>
 </body>







