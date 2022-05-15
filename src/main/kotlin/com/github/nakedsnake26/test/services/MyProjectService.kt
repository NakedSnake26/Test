package com.github.nakedsnake26.test.services

import com.intellij.openapi.project.Project
import com.github.nakedsnake26.test.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
