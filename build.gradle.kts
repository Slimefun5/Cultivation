plugins {
    java
    id("com.gradleup.shadow") version "9.3.2"
    id("io.github.intisy.github-gradle") version "1.8.2.1"
}

group = "dev.sefiraat"
version = "5.3.3"
description = "A Slimefun5 Addon that adds a plethora of Magical and non-magical flora."

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://jitpack.io")
    maven("https://repo.aikar.co/content/groups/aikar/")
    maven("https://repo.codemc.org/repository/maven-public")
}

apply(from = "https://raw.githubusercontent.com/Slimefun5/gradle/stable/slimefun-addon.gradle")

version = "5.3.3"

configurations.all {
    exclude(group = "org.spigotmc", module = "spigot-api")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    sourceCompatibility = "17"
    targetCompatibility = "17"
}

tasks.withType<ProcessResources> {
    filesMatching("plugin.yml") {
        expand(mapOf("version" to "5.3.3"))
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.4-R0.1-SNAPSHOT")
    compileOnly("io.github.baked-libs:dough-api:1.2.0")
    compileOnly("org.jetbrains:annotations:24.0.0")
    compileOnly("com.google.code.findbugs:annotations:3.0.1u2")
    implementation("dev.sefiraat:SefiLib:0.2.6") {
        exclude(group = "com.github.Slimefun", module = "Slimefun4")
    }
    implementation("co.aikar:acf-paper:0.5.1-SNAPSHOT")
    implementation("org.bstats:bstats-bukkit:3.0.0")
    implementation("io.papermc:paperlib:1.0.7")
}

tasks {
    shadowJar {
        archiveFileName.set("Cultivation-5.3.3.jar")
        exclude("dev/sefiraat/sefilib/slimefun/**")
        exclude("dev/sefiraat/sefilib/itemstacks/Cooldowns.class")
        exclude("dev/sefiraat/sefilib/entity/EntityUtils.class")
        relocate("org.bstats", "dev.sefiraat.cultivation.bstats")
        relocate("io.papermc.lib", "dev.sefiraat.cultivation.paperlib")
        relocate("co.aikar.commands", "dev.sefiraat.cultivation.acf")
        relocate("co.aikar.locales", "dev.sefiraat.cultivation.locales")
    }
}
