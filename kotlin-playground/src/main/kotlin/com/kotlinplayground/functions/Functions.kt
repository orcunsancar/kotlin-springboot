package com.kotlinplayground.functions

fun printName(name: String) {
    println("Name is : $name")
}

fun addition(x: Int, y: Int): Int {
    return x + y
}
fun addition_approach1(x: Int, y: Int): Int = x + y


fun main() {
    printName("Dilip")
    val result = addition(1, 2)
    println("Result is : $result")
    val result1 = addition_approach1(1, 2)
    println("Result is : $result1")
}


