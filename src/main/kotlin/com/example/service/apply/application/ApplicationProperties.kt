package com.example.service.apply.application

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConfigurationProperties("application")
@ConstructorBinding
class ApplicationProperties(
    val url: String
) {
}