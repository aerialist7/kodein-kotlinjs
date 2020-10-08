plugins {
    kotlin("js") version "1.3.72" apply false
    id("com.github.turansky.kfc.root") version "0.10.1"
    id("com.github.turansky.kfc.dev-server") version "0.10.1" apply false
    id("com.github.turansky.kfc.webcomponent") version "0.10.1" apply false
}

allprojects {
    repositories {
        jcenter()
    }
}

tasks {
    wrapper {
        distributionType = Wrapper.DistributionType.ALL
        gradleVersion = "6.6.1"
    }
}
