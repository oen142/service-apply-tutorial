package com.example.service.apply.domain.evaluationItem

import com.example.service.support.domain.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity

@Entity
class EvaluationItem(
    @Column(nullable = false)
    val title: String,

    @Column(nullable = false)
    val description: String,

    @Column(nullable = false)
    val maximumScore: Int,

    @Column(nullable = false)
    val position: Int = 0,

    @Column(nullable = false)
    val evaluationId: Long,

    id: Long
) : BaseEntity(id) {
}