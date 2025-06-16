package com.example.testapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.factory.notification.NotificationFactory
import com.example.testapp.factory.shape.ShapeFactory
import com.example.testapp.observer.stock_price_change.StockAlert
import com.example.testapp.observer.stock_price_change.StockLogger
import com.example.testapp.observer.stock_price_change.StockTicker
import com.example.testapp.observer.string_data.DataSource
import com.example.testapp.observer.string_data.LoggerObserver
import com.example.testapp.observer.string_data.UIObserver

/**
 * Use of LiveData to store Form data in viewmodel and survive the data in config change(screen rotation)
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("LEARNING", "In Activity --> onCreate()")

        val editTextName = findViewById<EditText>(R.id.editTextName)
        val editTextEmailAddress = findViewById<EditText>(R.id.editTextEmailAddress)

        findViewById<Button>(R.id.submit_button).setOnClickListener {
            val shape = ShapeFactory.createShape("polygon")
            shape.draw()
        }

        findViewById<Button>(R.id.next_activity_button).setOnClickListener {
            val notification = NotificationFactory.createNotification("email")
            notification.show(this)
        }

        findViewById<Button>(R.id.observer_pattern_button).setOnClickListener {
            var dataSource = DataSource()
            val loggerObserver = LoggerObserver()
            val uiObserver = UIObserver()

            dataSource.addObserver(loggerObserver)
            dataSource.addObserver(uiObserver)

            dataSource.notifyObservers("New data available.")
        }

        findViewById<Button>(R.id.observer_pattern_button2).setOnClickListener {
            var stockSource = StockTicker()
            val stockLogger = StockLogger()
            val stockAlert = StockAlert()

            stockSource.addObserver(stockLogger)
            stockSource.addObserver(stockAlert)

            stockSource.updatePrice("Medimix", 78.0)
            stockSource.updatePrice("Granite", 800.0)
        }
    }
}