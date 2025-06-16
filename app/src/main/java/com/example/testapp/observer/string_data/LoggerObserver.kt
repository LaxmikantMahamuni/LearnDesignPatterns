package com.example.testapp.observer.string_data

class LoggerObserver: Observer {
    override fun onUpdate(data: String) {
        println("Logger received: $data")
    }
}