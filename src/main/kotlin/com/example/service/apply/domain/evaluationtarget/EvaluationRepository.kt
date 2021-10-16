package com.example.service.apply.domain.evaluationtarget

import com.example.service.apply.domain.evalutaion.Evaluation
import org.springframework.data.jpa.repository.JpaRepository

interface EvaluationRepository : JpaRepository<Evaluation , Long> {
}