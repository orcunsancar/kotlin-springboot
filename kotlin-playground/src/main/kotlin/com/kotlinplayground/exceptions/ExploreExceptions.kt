package com.kotlinplayground.exceptions


fun returnNothing() : Nothing {

    throw RuntimeException("Exception")
}
fun main() {

    println("Name Legth is ${nameLength("Dilip")}")
    println("Name Legth is ${nameLength(null)}")
    returnNothing()
}

fun nameLength(name: String?): Int? {
    val result = try {
        name!!.length
    } catch (ex: Exception) {
        println("Exception is : $ex")
        null
    }
    return result
}
