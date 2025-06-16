package com.example.testapp.observer.string_data

class DataSource {
    private val observers = mutableListOf<Observer>()

    fun addObserver(observer: Observer){
        observers.add(observer)
    }

    fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    fun notifyObservers(data: String) {
        observers.forEach {
            it.onUpdate(data)
        }
    }
}