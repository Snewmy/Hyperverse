plugins {
    id("hyperverse.base-conventions")
    alias(libs.plugins.paperweight.userdev)
}

indra {
    javaVersions {
        minimumToolchain(25)
        target(25)
    }
}

dependencies {
    paperweight.paperDevBundle("26.1.2.build.+")
    compileOnly(projects.hyperverseNmsCommon)
}
