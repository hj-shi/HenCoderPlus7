package com.example.app.entity

inline fun measureTime(action: () -> Unit) {
    println(">>> ")
    val start = System.currentTimeMillis()

    action()

    val end = System.currentTimeMillis()
    println("<<< [${end - start}ms")
}

fun main() {
    measureTime {
        println("hello kotlin")
    }
}