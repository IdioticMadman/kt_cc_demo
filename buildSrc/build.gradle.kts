import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `kotlin-dsl`
}

repositories {
    maven { url = uri("https://maven.aliyun.com/repository/public/") }
    jcenter()
}