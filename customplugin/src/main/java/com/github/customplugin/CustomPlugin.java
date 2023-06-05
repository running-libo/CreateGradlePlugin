package com.github.customplugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class CustomPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        System.out.println("This is a custom plugin");
    }
}