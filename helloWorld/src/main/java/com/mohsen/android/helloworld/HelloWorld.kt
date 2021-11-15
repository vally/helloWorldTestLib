package com.mohsen.android.helloworld

class HelloWorld {

    private val first = "Hello"
    private val firstChar = ","
    private val second = "World"
    private val secondChar = "!"

    fun firstWord() = first
    fun secondWord() = second
    fun helloWorldText() = "$first$firstChar $second$secondChar"
}