package com.example.testapp.factory.notification

import android.content.Context
import android.widget.Toast

class PushNotification: Notification {
    override fun show(context: Context) {
        Toast.makeText(context, "Push Notification", Toast.LENGTH_SHORT).show()
    }
}