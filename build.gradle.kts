plugins {
    java
    id("com.gradleup.shadow") version "9.3.2"
    id("io.github.intisy.github-gradle") version "1.8.3"
}

group = "dev.sefiraat"
description = "Cultivation is a Slimefun addon that adds a plethora of magical and non-magical flora."

apply(from = "https://raw.githubusercontent.com/Slimefun5/gradle/main/slimefun-addon.gradle")

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
    }
}

dependencies {
    implementation("org.bstats:bstats-bukkit:3.0.2")
}

/** The 1.20.4 API is Java 17 bytecode, read here by a newer compiler that still emits Java 8 classes. */
configurations.named("compileClasspath") {
    attributes {
        attribute(org.gradle.api.attributes.java.TargetJvmVersion.TARGET_JVM_VERSION_ATTRIBUTE, 25)
    }
}

tasks {
    compileJava {
        options.release.set(8)
    }
    shadowJar {
        relocate("org.bstats", "dev.sefiraat.cultivation.libs.bstats")
    }
}
