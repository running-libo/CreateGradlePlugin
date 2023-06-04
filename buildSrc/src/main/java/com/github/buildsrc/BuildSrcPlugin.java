package com.github.buildsrc;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class BuildSrcPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        System.out.println("This is buildSrc plugin");
    }
}