plugins {
    id("com.github.turansky.kfc.webcomponent")
}

webcomponent {
    id = "hello-world"
    source = "com.github.aerialist7.HelloWorld"
}

dependencies {
    implementation(kotlin("stdlib-js"))

    implementation("org.kodein.di:kodein-di:7.0.0")
}