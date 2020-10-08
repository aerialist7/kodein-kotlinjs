plugins {
    id("com.github.turansky.kfc.dev-server")
}

devServer {
    root = "com.github.aerialist7"
}

dependencies {
    implementation(kotlin("stdlib-js"))

    implementation(project(":view"))
}