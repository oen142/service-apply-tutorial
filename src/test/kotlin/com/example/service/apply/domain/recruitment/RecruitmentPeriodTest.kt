package com.example.service.apply.domain.recruitment

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import java.time.LocalDateTime

internal class RecruitmentPeriodTest {
    private lateinit var now: LocalDateTime

    @BeforeEach
    internal fun setUp() {
        now = LocalDateTime.now()
    }

    @Test
    fun `시작 일시와 종료 일시는 동일할 수 있다`() {
        assertDoesNotThrow {
            RecruitmentPeriod(now, now)
        }
    }

    @Test
    fun `시작 일시와 종료 일시가 같으면 같은 기간이다`() {
        assertThat(RecruitmentPeriod(now, now)).isEqualTo(RecruitmentPeriod(now, now))
    }

    @Test
    fun `모집 기간 전`() {
        val tomorrow = now.plusDays(1L)
        val period = RecruitmentPeriod(tomorrow, tomorrow)
        assertThat(now.isBefore(period)).isTrue()
    }

    @Test
    fun `모집 기간 중`() {
        val period = RecruitmentPeriod(now.minusDays(1L), now.plusDays(1L))
        assertThat(now.isBetween(period)).isTrue()
    }

    @Test
    fun `모집 기간 후`() {
        val yesterday = now.minusDays(1L)
        val period = RecruitmentPeriod(yesterday, yesterday)
        assertThat(now.isAfter(period)).isTrue()
    }
}