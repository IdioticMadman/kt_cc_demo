// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        maven { url = uri("https://maven.aliyun.com/repository/public/") }
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:${Versions.gradlePlugin}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinPlugin}")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle.kts files
    }
}

allprojects {
    repositories {
        maven { url = uri("$rootDir/repo") }
        maven { url = uri("https://maven.aliyun.com/repository/public/") }
        google()
        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}