plugins {
    `polyworld-android-lib`
    `polyworld-android-lib-compose`
    `polyworld-maven-publish`
}

android {
    namespace = "com.github.kyhule.polyworld.ui.theme"
}

dependencies {
    implementation(externalLibs.androidx.coreKtx)
    implementation(externalLibs.androidx.lifecycle.runtimeKtx)
    implementation(externalLibs.androidx.activity.compose)
    implementation(externalLibs.androidx.compose.ui)
    implementation(externalLibs.androidx.compose.uiGraphics)
    implementation(externalLibs.androidx.compose.uiToolingPreview)
    implementation(externalLibs.androidx.compose.material3)
    testImplementation(externalLibs.junit)
    androidTestImplementation(externalLibs.androidx.test.extJunit)
    androidTestImplementation(externalLibs.androidx.test.espressoCore)
    androidTestImplementation(externalLibs.androidx.compose.uiTestJunit4)
    debugImplementation(externalLibs.androidx.compose.uiTooling)
    debugImplementation(externalLibs.androidx.compose.uiTestManifest)
}
