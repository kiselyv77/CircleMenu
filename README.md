
<body>
  <p>
    <img src="https://github.com/kiselyv77/CircleMenu/blob/master/gif/standart.gif" width="30%" height="30%"  />
    <img src="https://github.com/kiselyv77/CircleMenu/blob/master/gif/rotate.gif" width="30%" height="30%"  />
    <img src="https://github.com/kiselyv77/CircleMenu/blob/master/gif/color.gif" width="30%" height="30%"  />
    <img src="https://github.com/kiselyv77/CircleMenu/blob/master/gif/different.gif" width="30%" height="30%"  />
    <img src="https://github.com/kiselyv77/CircleMenu/blob/master/gif/duble.gif" width="30%" height="30%"  />
    <img src="https://github.com/kiselyv77/CircleMenu/blob/master/gif/duble2.gif" width="30%" height="30%"  />
  </p>
 </body>
 
 
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






