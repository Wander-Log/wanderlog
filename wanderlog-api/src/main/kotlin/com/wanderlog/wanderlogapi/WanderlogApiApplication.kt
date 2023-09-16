package com.wanderlog.wanderlogapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WanderlogApiApplication

fun main(args: Array<String>) {
    runApplication<WanderlogApiApplication>(*args)
}
