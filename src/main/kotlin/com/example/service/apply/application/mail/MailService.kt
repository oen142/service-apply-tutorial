package com.example.service.apply.application.mail

import com.example.service.apply.application.ApplicationProperties
import org.springframework.stereotype.Service
import org.thymeleaf.spring5.ISpringTemplateEngine

@Service
class MailService(
    private val applicationProperties: ApplicationProperties,
    private val templateEngine: ISpringTemplateEngine,
    private val mailSender: MailSender
) {

}