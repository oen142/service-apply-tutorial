package com.example.service.apply.application

import org.springframework.stereotype.Component
import java.util.*

@Component
class UUIDBasedPasswordGenerator : PasswordGenerator {
    override fun generate(): String {
        return UUID.randomUUID().toString().substring(0, 18)
    }
}