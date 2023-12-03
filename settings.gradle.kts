rootProject.name = "polyworld-theme"
include(":app")
include(":theme")

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
    id("com.github.kyhule.polyworld.build.settings") version "0.9.0"
}

dependencyResolutionManagement {
    versionCatalogs {
        create("externalLibs") {
            from("com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0")
        }
    }
}
