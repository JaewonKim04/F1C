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
include(":app")
include(":ui:home")
include(":data:result")
include(":domain:common")
include(":ui:core")
include(":ui:result")
include(":domain:result")
include(":navigate")
include(":network")
include(":ui:calendar")
