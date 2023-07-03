package com.durys.jakub.notificationclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
internal class NotificationClientApplication

fun main(args: Array<String>) {
	runApplication<NotificationClientApplication>(*args)
}
