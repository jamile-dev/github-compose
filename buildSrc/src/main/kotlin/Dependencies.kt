/**
 * Plugins
 */
object BuildPlugins {
    val android by lazy { "com.android.tools.build:gradle:${Versions.gradlePlugin}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}" }
}

/**
 * Dependencies
 */
object Deps {
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}" }
    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    val compose by lazy { "androidx.compose.ui:ui:${Versions.compose}" }
    val material by lazy { "androidx.compose.material:material:${Versions.compose}" }
    val previewTooling by lazy { "androidx.compose.material:material:${Versions.compose}" }
    val runtimeKtx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.runtimeKtx}" }
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }
    val timber by lazy { "com.jakewharton.timber:timber:${Versions.timber}" }
    val hilt by lazy { "com.google.dagger:hilt-android:${Versions.hilt}" }
    val hiltCompiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.hilt}" }
    val junit by lazy { "junit:junit:${Versions.junit}" }
    val extJUnit by lazy { "junit:junit:${Versions.junitExt}" }
    val espressoCore by lazy { "androidx.test.espresso:espresso-core:${Versions.espressoCore}" }
    val junitExt by lazy { "androidx.test.ext:junit:${Versions.junitExt}" }
    val junitCompose by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.compose}" }
    val composeUiTooling by lazy { "androidx.compose.ui:ui-tooling:${Versions.compose}" }
}