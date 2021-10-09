package com.example.service.apply.infra.mail

import com.amazonaws.auth.AWSStaticCredentialsProvider
import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.regions.Regions
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder
import com.amazonaws.services.simpleemail.model.*
import com.example.service.apply.application.mail.MailSender
import org.springframework.boot.autoconfigure.mail.MailProperties
import org.springframework.stereotype.Component

@Component
class AwsMailSender(
    private val mailProperties: MailProperties,
    awsProperties: AwsProperties
) : MailSender {
    private val client: AmazonSimpleEmailService = AmazonSimpleEmailServiceClientBuilder
        .standard()
        .withCredentials(
            AWSStaticCredentialsProvider(
                BasicAWSCredentials(
                    awsProperties.accessKey,
                    awsProperties.secretKey
                )
            )
        )
        .withRegion(Regions.AP_NORTHEAST_2)
        .build()

    override fun send(toAddress: String, subject: String, body: String) {
        val request = SendEmailRequest()
            .withSource(mailProperties.username)
            .withDestination(Destination().withToAddresses(toAddress))
            .withMessage(
                Message()
                    .withSubject(createContent(subject))
                    .withBody(Body().withHtml(createContent(body)))
            )
        client.sendEmail(request)
    }

    private fun createContent(data: String): Content {
        return Content(data).withCharset("UTF-8")
    }


}