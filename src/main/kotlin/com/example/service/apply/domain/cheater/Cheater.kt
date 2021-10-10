package com.example.service.apply.domain.cheater

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Cheater(
    @Column(nullable = false)
    val applicantId: Long,

    @Column(nullable = false)
    val createdDateTime: LocalDateTime = LocalDateTime.now(),

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L
)