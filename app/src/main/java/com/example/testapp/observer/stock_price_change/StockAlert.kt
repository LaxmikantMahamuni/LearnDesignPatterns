package com.example.testapp.observer.stock_price_change

class StockAlert: StockObserver {
    override fun onPriceChanged(stock: String, price: Double) {
        if(price> 500) {
            println("Alert $stock crossed Rs.500!")
        }
    }
}