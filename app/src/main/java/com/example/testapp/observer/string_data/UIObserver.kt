package com.example.testapp.observer.string_data

class UIObserver: Observer {
    override fun onUpdate(data: String) {
        println("UI updated with $data")
    }
}