plugins {
    id("org.openstreetmap.josm") version "0.6.1"
    java
}

java.sourceCompatibility = JavaVersion.VERSION_1_8
base.archivesBaseName = "joml"
project.version = "1.9.16"

repositories {
    jcenter()
}

dependencies {
    packIntoJar("org.joml:joml:1.9.16")
}

tasks {
    "processResources"(ProcessResources::class) {
        from(project.projectDir) {
            include("LICENSE")
        }
    }
}
