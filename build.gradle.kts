plugins {
    kotlin("js") version "1.4.20-M1" apply false
    id("com.github.turansky.kfc.root") version "0.16.1"
    id("com.github.turansky.kfc.dev-server") version "0.16.1" apply false
    id("com.github.turansky.kfc.webcomponent") version "0.16.1" apply false
}

allprojects {
    repositories {
        jcenter()
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
    }
}

tasks {
    wrapper {
        distributionType = Wrapper.DistributionType.ALL
        gradleVersion = "6.6.1"
    }
}
