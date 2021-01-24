package com.robert.register

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class RegisterPlugin : Plugin<Project> {
    companion object {
        const val PLUGIN_NAME = "register"
    }

    override fun apply(target: Project) {
        target.extensions
            .findByType(AppExtension::class.java)
            ?.registerTransform(RegisterTransform(target))
        println("hello plugin -> $PLUGIN_NAME")
    }
}