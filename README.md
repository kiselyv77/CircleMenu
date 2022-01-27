Gradle
------
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

```gradle
dependencies {
implementation 'com.github.kiselyv77:CircleMenu:V1.0'
}
```
