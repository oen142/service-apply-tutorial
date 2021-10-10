package com.example.service.apply.domain.recruitmentitem

import com.example.service.support.domain.BaseEntity
import org.springframework.data.jpa.domain.AbstractPersistable_.id
import javax.persistence.Column
import javax.persistence.Entity

@Entity
class RecruitmentItem(
    @Column(nullable = false)
    val recruitmentId: Long,


    id: Long = 0L

) : BaseEntity(id)