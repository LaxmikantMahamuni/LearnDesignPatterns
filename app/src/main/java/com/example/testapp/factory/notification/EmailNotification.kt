package com.example.testapp.factory.notification

import android.content.Context
import android.widget.Toast

class EmailNotification: Notification {
    override fun show(context: Context) {
        Toast.makeText(context, "Email Notification", Toast.LENGTH_SHORT).show()
    }
}