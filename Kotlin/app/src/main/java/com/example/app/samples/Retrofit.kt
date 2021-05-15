package com.example.app.samples

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.GET

interface API {
    @GET("lessons")
    fun lessons(): Call<Any>
}

val RETROFIT = Retrofit.Builder()
        .baseUrl("https://github.com/")
        .build()

inline fun <reified T> create(): T {
    return RETROFIT.create(T::class.java)
}

fun main() {
    println(create<API>())
}