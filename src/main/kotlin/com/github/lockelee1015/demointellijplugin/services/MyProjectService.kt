package com.github.lockelee1015.demointellijplugin.services

import com.intellij.openapi.project.Project
import com.github.lockelee1015.demointellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
