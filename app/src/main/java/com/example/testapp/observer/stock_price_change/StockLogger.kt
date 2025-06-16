package com.example.testapp.observer.stock_price_change

class StockLogger: StockObserver {
    override fun onPriceChanged(stock: String, price: Double) {
        println("Logging: $stock is now $price")
    }
}