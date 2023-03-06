plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-parcelize")
}

android {
    namespace = "ru.tech.imageresizershrinker"
    compileSdk = 33

    defaultConfig {
        applicationId = "ru.tech.imageresizershrinker"
        minSdk = 21
        targetSdk = 33
        versionCode = 28
        versionName = "1.8.1"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.2"
    }

    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation("androidx.activity:activity-compose:1.7.0-beta01")
    implementation("androidx.compose.material3:material3:1.1.0-alpha07")
    implementation("androidx.compose.material3:material3-window-size-class:1.1.0-alpha07")
    implementation("androidx.compose.material:material-icons-extended:1.4.0-beta02")
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.28.0")
    implementation("io.coil-kt:coil-compose:2.2.2")
    implementation("androidx.core:core-splashscreen:1.0.0")
    implementation("androidx.exifinterface:exifinterface:1.3.6")
    implementation(project(":cropper"))
    implementation(project(":dynamic_theme"))
    implementation(project(":colordetector"))
    implementation("dev.olshevski.navigation:reimagined:1.3.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.0-rc01")
    implementation("nl.dionsegijn:konfetti-compose:2.0.2")
    implementation("androidx.datastore:datastore-preferences:1.1.0-alpha01")
    implementation("androidx.documentfile:documentfile:1.0.1")
}