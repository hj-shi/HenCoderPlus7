package com.example.core

import android.widget.Toast
import com.example.core.utils.CacheUtils
import com.example.core.utils.Utils
import com.example.core.utils.dp2px

fun main() {
    println("hello world")
    var  age = 18
    val name = "kotlin"
    var java = Java()
    dp2px(18f)
    CacheUtils.get("shisji")
    Utils.toast("sjsjkjk")
    BaseApplication.currentApplication()
}

fun doubleNumber(x: Int): Int {
    return x * 2
}