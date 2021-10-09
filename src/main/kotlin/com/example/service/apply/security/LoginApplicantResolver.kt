package com.example.service.apply.security

import com.example.service.apply.application.ApplicantService
import org.springframework.stereotype.Component


@Component
class LoginApplicantResolver(
    private val jwtTokenProvider: JwtTokenProvider,
    private val applicantService: ApplicantService
) {
}