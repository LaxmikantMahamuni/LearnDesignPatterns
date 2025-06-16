package com.example.testapp.factory.notification

object NotificationFactory {
    fun createNotification(type: String): Notification {
        return when (type) {
            "email" -> EmailNotification()
            "push" -> PushNotification()
            else -> throw IllegalArgumentException("Unknown Notification type")
        }
    }
}