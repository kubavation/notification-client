package com.durys.jakub.notificationclient.api.client

import com.durys.jakub.notificationclient.api.model.Notification
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class NotificationClient(private val rabbitTemplate: RabbitTemplate,
                         @Value("\${queue.notification}") private val queue: String) {

    fun send(notification: Notification) = rabbitTemplate.convertAndSend(queue, notification)
}