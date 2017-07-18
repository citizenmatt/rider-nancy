package com.citizenmatt.rider.plugins.nancy.projectGenerators

import com.jetbrains.rider.projectView.projectGenerators.RiderZipProjectGenerator

class NancyApplication : RiderZipProjectGenerator() {
    override fun getName() = "Nancy Application"
    override fun getCategory(): String = "Nancy"
    override fun getDefaultProjectExtension() = "csproj"
    override fun getDefaultProjectName() = "NancyApplication"
    override fun getProjectTypeMainGuid() = "FAE04EC0-301F-11d3-BF4B-00C04F79EFBC"
    override fun getProjectTypeGuidList() = "{FAE04EC0-301F-11d3-BF4B-00C04F79EFBC}"
    override fun getTemplateName() = "NancyApp"
}