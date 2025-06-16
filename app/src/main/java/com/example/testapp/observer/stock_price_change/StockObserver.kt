package com.example.testapp.observer.stock_price_change

interface StockObserver {
    fun onPriceChanged(stock: String, price: Double)
}