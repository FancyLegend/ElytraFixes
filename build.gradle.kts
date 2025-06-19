plugins {
    java
}

group = "sb.lite"

repositories {
    // paper-api
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.2-R0.1-SNAPSHOT")
}

tasks.compileJava {
    options.release = 21
    options.encoding = "UTF-8"
}

tasks.jar {
    archiveVersion = ""
}

tasks.withType<ProcessResources> {
    val properties = providers.gradlePropertiesPrefixedBy("")
    filesMatching("plugin.yml") {
        expand(properties.get())
    }
}