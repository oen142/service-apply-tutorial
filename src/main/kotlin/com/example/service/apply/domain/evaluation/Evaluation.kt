package com.example.service.apply.domain.evaluation

import com.example.service.support.domain.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity

@Entity
class Evaluation(
    @Column(nullable = false)
    val title: String,

    @Column(nullable = false)
    val description: String,

    @Column(nullable = false)
    val recruitmentId: Long,

    var beforeEvaluationId: Long = 0L,
    id: Long = 0L
) : BaseEntity(id) {

    fun hasBeforeEvaluation(): Boolean = beforeEvaluationId != 0L

    fun hasSameBeforeEvaluationWith(beforeEvaluationId: Long): Boolean =
        this.beforeEvaluationId == beforeEvaluationId

    fun resetBeforeEvaluation() {
        beforeEvaluationId = 0L
    }
}