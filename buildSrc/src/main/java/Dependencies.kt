object Dependencies {

    object Kotlin {
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    }

    object AndroidX {
        const val appCompat = "androidx.appcompat:appcompat:${Versions.AndroidX.appCompat}"
        const val coreKtx = "androidx.core:core-ktx:${Versions.AndroidX.coreKtx}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.constraintLayout}"

        object Test {
            const val ext = "androidx.test.ext:junit:${Versions.AndroidX.Test.ext}"
            const val espresso =
                "androidx.test.espresso:espresso-core:${Versions.AndroidX.Test.espresso}"
        }
    }

    object Test {
        const val jUnit = "junit:junit:${Versions.Test.jUnit}"
    }
}