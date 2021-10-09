package com.example.service.apply

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync

@EnableAsync
@ConfigurationPropertiesScan
@SpringBootApplication
class ServiceApplyTutorialApplication

fun main(args: Array<String>) {
    runApplication<ServiceApplyTutorialApplication>(*args)
}
