package com.example.service.apply.domain.evaluationtarget

import org.springframework.data.jpa.repository.JpaRepository

interface EvaluationTargetRepository : JpaRepository<EvaluationTarget, Long> {
}