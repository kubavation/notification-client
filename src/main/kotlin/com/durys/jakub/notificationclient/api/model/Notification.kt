package com.durys.jakub.notificationclient.api.model


class Notification(val tenantId: TenantId? = null,
                   val subject: String? = null,
                   val content: String? = null,
                   val types: List<NotificationType> = listOf(NotificationType.APP)) {
    var url = ""

    fun withUrl(value: String): Notification {
        this.url = value
        return this
    }

}