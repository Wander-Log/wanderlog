tasks.getByName("bootJar") {
    enabled = true
}

dependencies {
    implementation(project(":storage"))

    implementation(project(":clients:client-common"))

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}