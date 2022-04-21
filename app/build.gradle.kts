plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = ConfigData.compileSdkVersion

    defaultConfig {
        applicationId = "dev.jamile.githubcompose"
        minSdk = ConfigData.minSdkVersion
        targetSdk = ConfigData.targetSdkVersion
        versionCode = ConfigData.versionCode
        versionName = ConfigData.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles (
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose
    }
    packagingOptions {
        resources.excludes += "META-INF/**/*"
    }
}

dependencies {
    implementation(Deps.kotlin)
    implementation(Deps.coreKtx)

    // Compose
    implementation(Deps.compose)
    implementation(Deps.material)
    implementation(Deps.previewTooling)
    implementation(Deps.activityCompose)

    // Hilt
    implementation(Deps.hilt)
    implementation(Deps.hiltCompiler)

    implementation(Deps.runtimeKtx)
    implementation(Deps.timber)

    // Test
    testImplementation(Deps.junit)
    androidTestImplementation(Deps.extJUnit)
    androidTestImplementation(Deps.espressoCore)
    androidTestImplementation(Deps.junitExt)
    androidTestImplementation(Deps.junitCompose)
    debugImplementation(Deps.composeUiTooling)
}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}