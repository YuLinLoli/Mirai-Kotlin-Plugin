import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    val kotlinVersion = "1.8.0"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.noarg") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.allopen") version kotlinVersion
    id("net.mamoe.mirai-console") version "2.16.0"
    id("com.github.gmazzo.buildconfig") version "4.1.1"
}

group = "com.mirai"
version = "1.0.2"

repositories {
    mavenLocal()
//    maven("https://maven.aliyun.com/repository/gradle-plugin")
//    maven("https://maven.aliyun.com/repository/central")
    maven("https://s01.oss.sonatype.org/content/repositories/snapshots")
    mavenCentral()
}
buildConfig {
    className("BuildConfig")
    packageName("com.mirai")
    buildConfigField("String", "version", "\"${version}\"")
    buildConfigField("String", "name", "\"name\"")
    buildConfigField("String", "id", "\"com.mirai\"")
}
dependencies {
    testConsoleRuntime("top.mrxiaom:overflow-core:2.16.0-d59ef26-SNAPSHOT")

    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("org.jsoup:jsoup:1.15.4")
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    implementation("net.mamoe:mirai-core-jvm:2.15.0-M1")
    implementation("top.jfunc.common:converter:1.8.0")


    implementation("com.madgag:animated-gif-lib:1.4")
    compileOnly("org.bytedeco:javacv-platform:1.5.7")
//    compileOnly
    implementation(kotlin("stdlib-jdk8"))
}


val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "17"
}

val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "17"
}

