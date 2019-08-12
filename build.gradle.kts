import org.openstreetmap.josm.gradle.plugin.config.I18nConfig
import org.openstreetmap.josm.gradle.plugin.config.JosmManifest

plugins {
  id("org.openstreetmap.josm") version "0.6.1"
  java
}

repositories {
  jcenter()
}

java.sourceCompatibility = JavaVersion.VERSION_1_8
base.archivesBaseName = "joml"

tasks {
  "processResources"(ProcessResources::class) {
    from(project.projectDir) {
      include("LICENSE")
    }
  }
}
