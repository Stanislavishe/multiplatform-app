enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "multi_playzone"
include(":playzoneAndr")
include(":common:auth:api")
include(":common:auth:presentation")
include(":common:auth:data")
include(":common:tournaments:data")
include(":common:tournaments:api")
include(":common:tournaments:presentation")
include(":common:games:presentation")
include(":common:games:api")
include(":common:games:data")
include(":common:core")
include(":common:umbrella-ios")
include(":common:umbrella-compose")
