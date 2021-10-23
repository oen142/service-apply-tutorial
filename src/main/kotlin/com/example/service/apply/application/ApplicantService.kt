package com.example.service.apply.application

import com.example.service.apply.domain.applicant.Applicant
import com.example.service.apply.domain.applicant.ApplicantRepository
import com.example.service.apply.domain.applicationform.ApplicationFormRepository
import com.example.service.apply.domain.cheater.CheaterRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.lang.IllegalArgumentException

@Transactional
@Service
class ApplicantService(
    private val applicantFormRepository: ApplicationFormRepository,
    private val applicantRepository: ApplicantRepository,
    private val cheaterRepository: CheaterRepository,
    private val passwordGenerator: PasswordGenerator
) {

    fun getByEmail(email: String): Applicant {
        return applicantRepository.findByEmail(email)
            ?: throw IllegalArgumentException("지원자가 존재하지 않습니다. email : $email")
    }

    fun findAllByRecruitmentIdAndKeyword(
        recruitmentId: Long,
        keyword: String
    ): List<ApplicantAndFormResponse> {
        return emptyList()
    }
}