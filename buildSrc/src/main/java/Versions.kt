object Versions {
    const val kotlin = "1.3.61"
    const val gradlePlugin = "3.6.2"

    const val compileSdk = 29
    const val buildTools = "29.0.2"
    const val minSdk = 23
    const val targetSdk = 29

    object LifecycleLogger {
        private val version = Version(0, 1, 0, 0)
        val code = version.getVersionCode()
        val name = version.getVersionName()
    }

    object Sample {
        const val code = 1
        const val name = "1.0"
    }

    object AndroidX {
        const val appCompat = "1.0.2"
        const val coreKtx = "1.0.2"
        const val constraintLayout = "1.1.3"

        object Test {
            const val ext = "1.1.1"
            const val espresso = "3.2.0"
        }
    }

    object Test {
        const val jUnit = "4.12"
    }

    private fun Version.getVersionName(): String {
        return "$major.$minor.$patch.$rc"
    }

    private fun Version.getVersionCode(): Int {
        return ((1 + major) * 10000 + minor * 100 + patch) * 100 + rc
    }

    private data class Version(
        val major: Int,
        val minor: Int,
        val patch: Int,
        val rc: Int
    )
}