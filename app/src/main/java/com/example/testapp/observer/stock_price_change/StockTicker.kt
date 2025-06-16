package com.example.testapp.observer.stock_price_change

class StockTicker {
    private var stocks = mutableListOf<StockObserver>()

    fun addObserver(observer: StockObserver){
        stocks.add(observer)
    }

    fun removeObserver(observer: StockObserver) {
        stocks.remove(observer)
    }

    fun updatePrice(stock: String, price: Double){
        stocks.forEach {
            it.onPriceChanged(stock, price)
        }
    }
}