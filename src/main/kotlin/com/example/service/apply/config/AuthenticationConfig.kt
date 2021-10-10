package com.example.service.apply.config

import com.example.service.apply.security.LoginApplicantResolver
import org.springframework.context.annotation.Configuration
import org.springframework.web.method.support.HandlerMethodArgumentResolver
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class AuthenticationConfig(
) : WebMvcConfigurer {
}