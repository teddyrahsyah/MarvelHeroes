# MarvelHeroes

This is an example of simple app with RecyclerView.
There are 3 modes of list that i used in this app which are List, Grid, and CardView.

## 3rd Party Dependencies

This app needs some other dependencies such as [RecyclerView](https://developer.android.com/jetpack/androidx/releases/recyclerview), [CardView](https://developer.android.com/jetpack/androidx/releases/cardview), [CircleImage](https://github.com/hdodenhof/CircleImageView), and [Glide](https://github.com/bumptech/glide) (for images).

Make sure you have those dependencies in build.gradle(app) file.

```gradle
plugins {
    id 'com.android.application'
    id 'kotlin-android'
}

android {
    ...
}

dependencies {

    ...
    
    // 3rd Party Dependencies
    implementation 'androidx.recyclerview:recyclerview:1.1.0'
    implementation 'androidx.cardview:cardview:1.0.0'
    implementation 'de.hdodenhof:circleimageview:3.1.0'
    implementation 'com.github.bumptech.glide:glide:4.11.0'
    
}
```
