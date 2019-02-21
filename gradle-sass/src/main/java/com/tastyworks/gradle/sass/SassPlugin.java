package com.tastyworks.gradle.sass;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * Compiles Sass to CSS.
 */
public class SassPlugin implements Plugin<Project> {

    public void apply(Project project) {
        project.getExtensions().create("sass", SassExtension.class);
        project.getTasks().create("compileSass", CompileSass.class);
    }

}
