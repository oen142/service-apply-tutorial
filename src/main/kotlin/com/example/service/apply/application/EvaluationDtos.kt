package com.example.service.apply.application

import com.example.service.apply.domain.evaluation.Evaluation
import com.example.service.apply.domain.recruitment.Recruitment
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

data class EvaluationSelectData(
    @field:NotBlank
    @field:Size(min = 1, max = 31)
    var title: String = "",
    var id: Long = 0L
) {
    constructor(evaluation: Evaluation) : this(
        evaluation.title,
        evaluation.id
    )
}

data class RecruitmentSelectData(
    @field:NotBlank
    @field:Size(min = 1, max = 31)
    var title: String = "",
    var id: Long = 0L
) {
    constructor(recruitment: Recruitment) : this(
        recruitment.title,
        recruitment.id
    )
}