package com.example.service.apply.infra.mail

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConfigurationProperties("aws")
@ConstructorBinding
class AwsProperties(val accessKey: String, val secretKey: String) {
}