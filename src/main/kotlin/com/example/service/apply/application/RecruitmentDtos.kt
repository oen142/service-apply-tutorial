package com.example.service.apply.application

import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

data class RecruitmentData(
  @field:NotBlank
  @field:Size(min = 1 , max = 31)
  var title: String = "",
)