plugins {
    id("java")
    id("io.papermc.paperweight.userdev") version "1.5.11"
    id("xyz.jpenilla.run-paper") version "2.2.2"
}

group = "net.faceless"
version = "1.0-SNAPSHOT"
description = "Test plugin for paperweight-userdev"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

dependencies {
    paperweight.paperDevBundle("1.20.4-R0.1-SNAPSHOT")
    compileOnly("io.papermc.paper:paper-api:1.20.4-R0.1-SNAPSHOT")
}


repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
    maven {
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
}

tasks {
    compileJava {
        options.encoding = Charsets.UTF_8.name()

        options.release.set(17)
    }
    javadoc {
        options.encoding = Charsets.UTF_8.name()
    }

}
tasks.reobfJar{
    outputJar.set(layout.buildDirectory.file("C:\\Users\\Faceless\\Desktop\\Servers\\Paper 1.20.4\\plugins\\PaperNms-${project.version}.jar"))
}

