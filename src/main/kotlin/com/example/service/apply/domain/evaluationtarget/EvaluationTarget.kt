package com.example.service.apply.domain.evaluationtarget

import com.example.service.support.domain.BaseEntity
import javax.persistence.*

@Entity
class EvaluationTarget(
    @Column(nullable = false)
    val evaluationId: Long = 0L,

    val administrationId: Long? = null,

    @Column(nullable = false)
    val applicantId: Long,

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    var evaluationStatus: EvaluationStatus = EvaluationStatus.WAITING,

    @Embedded
    var evaluationAnswers: EvaluationAnswers = EvaluationAnswers(),

    var note: String = "",

    id: Long = 0L
) : BaseEntity(id) {

    constructor(evaluationId: Long, applicantId: Long) : this(
        evaluationId = evaluationId,
        administratorId = 0L,
        applicantId = applicantId
    )


    val isPassed: Boolean
        get() = this.evaluationStatus == EvaluationStatus.PASS

    fun update(
        evaluationStatus: EvaluationStatus,
        evaluationAnswers: EvaluationAnswers,
        note: String
    ) {
        this.evaluationStatus = evaluationStatus
        this.evaluationAnswers = evaluationAnswers
        this.note = note
    }

}