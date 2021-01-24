plugins {
    id("maven-publish")
    id("org.jetbrains.kotlin.jvm")
}

repositories {
    maven { url = uri("https://maven.aliyun.com/repository/public/") }
    google()
    jcenter()
}

dependencies {
    implementation(gradleApi())
    implementation(PluginDependencies.androidPlugin)
    implementation("org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinPlugin}")
}

val sourceJar by tasks.creating(Jar::class) {
    archiveClassifier.set("sources")
    from(sourceSets.getByName("main").allSource)
}
val javadocJar by tasks.creating(Jar::class) {
    archiveClassifier.set("javadoc")
    from(destinationDirectory)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            artifactId = "register"
            groupId = "com.robert"
            version = "1.0.0"
            from(components["java"])
            artifact(sourceJar)
            artifact(javadocJar)
            pom {
                description.set("copy cc by kotlin language")
                name.set("register")
                developers {
                    developer {
                        id.set("robert")
                        name.set("robert xiong")
                        email.set("idioticbear666@gmail.com")
                    }
                }
            }
        }
    }

    repositories {
        maven {
            url = uri("$rootDir/repo")
        }
    }
}