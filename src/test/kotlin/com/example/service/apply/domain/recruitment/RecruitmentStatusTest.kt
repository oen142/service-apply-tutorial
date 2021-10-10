package com.example.service.apply.domain.recruitment

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import java.time.LocalDateTime

internal class RecruitmentStatusTest {
    @ValueSource(booleans = [true, false])
    @ParameterizedTest
    fun `시작 일시 전이면 모집 예정`(recruitable: Boolean) {
        val tomorrow = LocalDateTime.now().plusDays(1)
        val period = RecruitmentPeriod(startDateTime = tomorrow, endDateTime = tomorrow)
        val status = RecruitmentStatus.of(period, recruitable)
        assertThat(status).isEqualTo(RecruitmentStatus.RECRUITABLE)
    }
}