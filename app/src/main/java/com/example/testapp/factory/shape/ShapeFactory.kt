package com.example.testapp.factory.shape

object ShapeFactory {

    fun createShape(type: String): Shape {
        return when (type.lowercase()) {
            "circle" -> Circle()
            "rectangle" -> Rectangle()
            "triangle" -> Triangle()
            else -> throw IllegalArgumentException("Shape not found: $type")
        }
    }
}