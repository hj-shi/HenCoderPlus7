package com.example.app.entity

import android.view.View


class View2 {
    fun setOnClickListener(listener: (View) -> Unit) {
    }
}

fun main() {
    val view = View2()
    view.setOnClickListener {
        println("点击")
    }
}

fun onClick(view: View) {
    println("点击")
}
