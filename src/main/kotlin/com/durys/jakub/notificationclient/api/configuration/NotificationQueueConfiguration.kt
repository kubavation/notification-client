package com.durys.jakub.notificationclient.api.configuration

import org.springframework.amqp.core.Queue
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
internal class NotificationQueueConfiguration {

    @Bean
    fun notificationQueue(@Value("\${queue.notification}") notificationQueue: String)
            = Queue(notificationQueue)

    @Bean
    fun converter() = Jackson2JsonMessageConverter()

}