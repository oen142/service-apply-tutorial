package com.example.service.apply.domain.recruitment

enum class RecruitmentStatus {
    RECRUITABLE, RECRUITING, UNRECRUITABLE, ENDED;

    companion object {
        fun of(period: RecruitmentPeriod, recruitable: Boolean): Any {
            TODO("Not yet implemented")
        }

    }
}