plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(Versions.compileSdk)
    buildToolsVersion(Versions.buildTools)

    defaultConfig {
        minSdkVersion(Versions.minSdk)
        targetSdkVersion(Versions.targetSdk)
        versionCode = Versions.LifecycleLogger.code
        versionName = Versions.LifecycleLogger.name

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android.txt"),
                file("proguard-rules.pro")
            )
        }
    }
    packagingOptions {
        exclude("assets/*")
    }
    libraryVariants.all {
        outputs.all {
            packageLibraryProvider?.configure {
                exclude("libs/*")
            }
            (this as com.android.build.gradle.internal.api.BaseVariantOutputImpl).outputFileName =
                when (name) {
                    android.buildTypes.getByName("release").name -> {
                        outputFile.name.replace(("-release.aar"), "-${version}.aar")
                    }
                    android.buildTypes.getByName("debug").name -> {
                        outputFile.name.replace((".aar"), "-${version}.aar")
                    }
                    else -> {
                        throw IllegalStateException("$name is not found...")
                    }
                }
        }
    }

}


dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to arrayOf("*.jar"))))
    implementation(Dependencies.Kotlin.stdLib)
    implementation(Dependencies.AndroidX.appCompat)
    implementation(Dependencies.AndroidX.coreKtx)
    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.AndroidX.Test.ext)
    androidTestImplementation(Dependencies.AndroidX.Test.espresso)
}
