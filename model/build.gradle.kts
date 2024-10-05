

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    id("java-library")
    //task info plugin to use this plugin
    // ./gradlew tiTree :model:test
    //https://gitlab.com/barfuin/gradle-taskinfo
    id("org.barfuin.gradle.taskinfo") version "2.2.0"
    id("com.autonomousapps.dependency-analysis") version "2.1.4"
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use JUnit Jupiter for testing.
    testImplementation(libs.junit.jupiter)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // This dependency is used by the application.
    api(libs.guava)
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}



tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}



tasks.named<JavaCompile>("compileJava") {
    options.isDebug=false
}
