package com.example.service.apply.domain.applicant

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Embeddable
import javax.persistence.EnumType
import javax.persistence.Enumerated

@Embeddable
data class ApplicantInformation(
    @Column(nullable = false)
    val name: String,

    @Column(unique = true, nullable = false)
    val email: String,

    @Column(nullable = false)
    val phoneNumber: String,

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    val gender: Gender,

    @Column(nullable = false)
    val birthDay: LocalDate
) {
    fun same(name: String, birthDay: LocalDate): Boolean {
        return this.name == name && this.birthDay == birthDay
    }
}