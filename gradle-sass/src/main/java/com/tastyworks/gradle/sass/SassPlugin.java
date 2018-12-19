package com.tastyworks.gradle.sass;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

import javax.inject.Inject;

/**
 * Compiles Sass to CSS.
 */
public class SassPlugin implements Plugin<Project> {

    @Inject
    public void apply(Project project) {
        project.getExtensions().create("sass", SassExtension.class);
        project.getTasks().create("compileSass", CompileSass.class);
    }

}
