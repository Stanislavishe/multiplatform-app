
plugins {
    alias(libs.plugins.androidLibrary)
    kotlin("multiplatform")
    alias(libs.plugins.composeGradlePlugin)
    alias(libs.plugins.compose.compiler)
}

kotlin {
    jvm("desktop")

    sourceSets {
        named("commonMain") {
            dependencies {
                implementation(compose.foundation)
                implementation(compose.runtime)
                implementation(compose.material3)
            }
        }

        named("desktopMain") {
            dependencies {
                implementation(compose.desktop.common)
            }
        }
    }
}

android {
    namespace = "com.example.multi_playzone.android"
    compileSdk = 34

    defaultConfig {
        minSdk = 24
        targetSdk = 34
    }
    composeCompiler {}

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    sourceSets {
        named("main") {
            manifest.srcFile("src/androidMain/AndroidManifest.xml")
            res.srcDirs("src/androidMain/res", "src/commonMain/resources")
        }
    }
}