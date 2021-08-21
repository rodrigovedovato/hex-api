plugins {
    id("org.springframework.boot") version "2.5.3"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.5.21"
    kotlin("plugin.spring") version "1.5.21"
    kotlin("plugin.jpa") version "1.5.21"
    kotlin("plugin.allopen") version "1.5.21"
    kotlin("kapt") version "1.5.21"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":hex-domain"))
    implementation(project(":hex-infrastructure"))

    //Springboot framework
    implementation("org.springframework.boot:spring-boot-starter-web")
    //api health
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    //Kotlin
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    //Kotlin reflection -> enable runtime class reference
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    //Springboot dev tools -> additional development-time features
    developmentOnly("org.springframework.boot:spring-boot-devtools")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

//Target jvm when kotlinCompile
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

//Target Junit on Test classes
tasks.withType<Test> {
    useJUnitPlatform()
}
