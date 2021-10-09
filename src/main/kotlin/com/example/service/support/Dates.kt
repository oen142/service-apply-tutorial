package com.example.service.support

import java.time.LocalDate
import java.time.LocalDateTime

fun createLocalDateTime(
    year: Int,
    month: Int = 1,
    dayOfMonth: Int = 1,
    hour: Int = 0,
    minute: Int = 0,
    second: Int = 0,
    nanoOfSecond: Int = 0
): LocalDateTime = LocalDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond)


fun createLocalDate(
    year: Int,
    month: Int = 1,
    dayOfMonth: Int
): LocalDate = LocalDate.of(year, month, dayOfMonth)