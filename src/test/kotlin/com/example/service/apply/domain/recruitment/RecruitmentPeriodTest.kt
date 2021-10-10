package com.example.service.apply.domain.recruitment

import org.junit.jupiter.api.BeforeEach
import java.time.LocalDateTime

internal class RecruitmentPeriodTest {
    private lateinit var now: LocalDateTime

    @BeforeEach
    internal fun setUp() {
        now = LocalDateTime.now()
    }


}