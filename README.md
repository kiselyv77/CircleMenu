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
standart sircle menu
```kotlin
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

```
