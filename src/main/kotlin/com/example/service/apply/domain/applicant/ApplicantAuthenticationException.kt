package com.example.service.apply.domain.applicant

import java.lang.RuntimeException

class ApplicantAuthenticationException(
    message: String = "요청 정보가 기존 지원자 정보와 일치하지 않습니다."
) : RuntimeException(message)