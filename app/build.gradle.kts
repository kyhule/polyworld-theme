plugins {
    `polyworld-android-app`
    `polyworld-android-app-compose`
}

android {
    namespace = "com.github.kyhule.polyworld.feature.app"
    defaultConfig {
        applicationId = "com.github.kyhule.polyworld.feature.app"
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(externalLibs.androidx.activity.compose)
    implementation(externalLibs.androidx.compose.material3)
    implementation(externalLibs.androidx.compose.ui)
    implementation(externalLibs.androidx.compose.uiGraphics)
    implementation(externalLibs.androidx.compose.uiToolingPreview)
    implementation(externalLibs.androidx.coreKtx)
    implementation(externalLibs.androidx.lifecycle.runtimeKtx)

    debugImplementation(externalLibs.androidx.compose.uiTestManifest)
    debugImplementation(externalLibs.androidx.compose.uiTooling)

    testImplementation(externalLibs.junit)

    androidTestImplementation(externalLibs.androidx.compose.uiTestJunit4)
    androidTestImplementation(externalLibs.androidx.test.espressoCore)
    androidTestImplementation(externalLibs.androidx.test.extJunit)
}
