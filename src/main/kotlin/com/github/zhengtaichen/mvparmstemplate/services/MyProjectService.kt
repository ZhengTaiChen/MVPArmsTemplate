package com.github.zhengtaichen.mvparmstemplate.services

import com.github.zhengtaichen.mvparmstemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
