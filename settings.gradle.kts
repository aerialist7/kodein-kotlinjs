rootProject.name = "kodein-kotlinjs"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
    }
}

include("view")
include("dev-server")