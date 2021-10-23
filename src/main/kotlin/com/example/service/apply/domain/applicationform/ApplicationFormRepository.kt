package com.example.service.apply.domain.applicationform

import org.springframework.data.jpa.repository.JpaRepository

interface ApplicationFormRepository : JpaRepository<ApplicationForm, Long> {
    fun findByRecruitmentIdAndSubmittedTrue(recruitmentId: Long) : List<ApplicationForm>
}