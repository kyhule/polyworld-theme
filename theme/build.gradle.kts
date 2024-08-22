plugins {
    `polyworld-android-lib`
    `polyworld-android-lib-compose`
    `polyworld-maven-publish`
}

android {
    namespace = "com.github.kyhule.polyworld.ui.theme"
}

dependencies {
    implementation(externalLibs.androidx.activity.compose)
    implementation(externalLibs.androidx.coreKtx)
    implementation(externalLibs.androidx.lifecycle.runtimeKtx)
    implementation(externalLibs.androidxComposeMaterial3.material3)
    implementation(externalLibs.androidxComposeUi.ui)
    implementation(externalLibs.androidxComposeUi.uiGraphics)
    implementation(externalLibs.androidxComposeUi.uiToolingPreview)

    debugImplementation(externalLibs.androidxComposeUi.uiTestManifest)
    debugImplementation(externalLibs.androidxComposeUi.uiTooling)

    testImplementation(externalLibs.junit)

    androidTestImplementation(externalLibs.androidx.test.espressoCore)
    androidTestImplementation(externalLibs.androidx.test.extJunit)
    androidTestImplementation(externalLibs.androidxComposeUi.uiTestJunit4)
}
