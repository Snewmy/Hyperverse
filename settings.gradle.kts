enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
    includeBuild("gradle/build-logic")
}

rootProject.name = "Hyperverse"

include(":hyperverse-nms-common")
include(":hyperverse-core")

include(":hyperverse-nms-unsupported")
include(":hyperverse-nms-26-1")
include(":hyperverse-nms-26-2")
