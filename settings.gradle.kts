rootProject.name = "polyworld-template"
include(":app")
include(":library")

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven {
            name = "githubPackages"
            url = uri("https://maven.pkg.github.com/kyhule/*")
            credentials(PasswordCredentials::class)
        }
    }
}

plugins {
    id("com.github.kyhule.polyworld.build.settings") version "0.4.0"
}

dependencyResolutionManagement {
    versionCatalogs {
        create("externalLibs") {
            from("com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0")
        }
    }
}
