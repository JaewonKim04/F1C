pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "F1C"
include(
    ":app",
    ":feature:home",
    ":core:ui",
    ":feature:result",
    ":feature:calendar",
    ":data:result",
    ":data:calendar",
    ":core:domain",
    ":domain:common",
    ":domain:result",
    ":domain:calendar",
    ":navigate",
    ":network",
    ":data:core"
)
