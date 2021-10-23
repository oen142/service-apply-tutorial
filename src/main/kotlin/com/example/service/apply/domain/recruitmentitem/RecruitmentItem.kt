package com.example.service.apply.domain.recruitmentitem

import com.example.service.support.domain.BaseEntity
import org.springframework.data.jpa.domain.AbstractPersistable_.id
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Lob

@Entity
class RecruitmentItem(
    @Column(nullable = false)
    val recruitmentId: Long,

    @Column(nullable = false)
    val title: String,

    @Column(nullable = false)
    val position: Int,

    @Column(nullable = false)
    val maximumLength: Int,

    @Column(nullable = false)
    @Lob
    val description: String,
    id: Long = 0L

) : BaseEntity(id)