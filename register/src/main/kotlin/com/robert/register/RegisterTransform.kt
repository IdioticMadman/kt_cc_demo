package com.robert.register

import com.android.build.api.transform.*
import com.android.build.gradle.internal.pipeline.TransformManager
import org.gradle.api.Project

class RegisterTransform(val project: Project) : Transform() {
    companion object {
        const val TRANSFORM_NAME = "register_transform"
    }

    override fun getName(): String = TRANSFORM_NAME

    override fun getInputTypes(): MutableSet<QualifiedContent.ContentType> =
        TransformManager.CONTENT_CLASS

    override fun getScopes(): MutableSet<in QualifiedContent.Scope> =
        TransformManager.SCOPE_FULL_PROJECT

    override fun isIncremental(): Boolean = false


    override fun transform(transformInvocation: TransformInvocation?) {
        println("hello $TRANSFORM_NAME")
    }

}