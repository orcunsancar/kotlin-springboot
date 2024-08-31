package com.kotlinplayground.basics

fun main() {
    //if-else
    //when

    var name = "Alex"
    // name = "Chloe"
   val result = if(name.length == 4) {
        println("Name is Four Characters")
       name.length
    }
    else  {
        println("Name is not Four Characters")
       name.length
    }

    println("result: $result")

    // 1 -> GOLD, 2 -> SILVER, 3 -> BRONZE

    var position = 1
    position = 4

    val medal = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }

    println(medal)
}