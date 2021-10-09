package com.example.service.apply

import com.example.service.apply.domain.applicationform.ApplicationForm
import com.example.service.apply.domain.applicationform.ApplicationFormAnswer
import com.example.service.apply.domain.applicationform.ApplicationFormAnswers

fun createApplicationForm(
    applicantId: Long = 1L,
    recruitmentId: Long = 1L,
    referenceUrl: String = "http://example.com",
    applicationFormAnswers: ApplicationFormAnswers = createApplicationFormAnswers()
): ApplicationForm {
    return ApplicationForm(applicantId, recruitmentId, referenceUrl, applicationFormAnswers)
}

fun createApplicationFormAnswers(
    applicationFormAnswers: MutableList<ApplicationFormAnswer> = mutableListOf(
        createApplicationFormAnswer(),
        createApplicationFormAnswer("책임감", 2L)
    )
): ApplicationFormAnswers {
    return ApplicationFormAnswers(applicationFormAnswers)
}

fun createApplicationFormAnswer(
    contents: String = "스타트업을 하고 싶습니다.",
    recruitmentId: Long = 1L
): ApplicationFormAnswer {
    return ApplicationFormAnswer(contents, recruitmentId)
}
