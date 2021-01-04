package com.github.rajin9601.intellijplugintest.services

import com.intellij.openapi.project.Project
import com.github.rajin9601.intellijplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
