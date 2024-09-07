package com.kotlinplayground.collections

fun main() {

    val names = listOf("Alex", "Ben", "Chloe")
    println("Names : $names")

    val namesMutableList = mutableListOf("Alex", "Ben", "Chloe")
    println("namesMutableList : $namesMutableList")
    namesMutableList.add("Adam")
    println("namesMutableList after : $namesMutableList")

    val set = setOf("Alex", "Ben", "Chloe")
    println("set : $set")

    val mutableSet = mutableSetOf("Alex", "Ben", "Chloe")
    println("mutableSet : $mutableSet")
    mutableSet.add("Adam")
    println("mutableSet after : $mutableSet")

    val nameAgeMap = mapOf("Dilip" to 34, "Scooby" to 4)
    println("nameAgeMap : $nameAgeMap")

    val nameAgeMutableMap = mutableMapOf("Dilip" to 34, "Scooby" to 4)
    println("nameAgeMutableMap : $nameAgeMutableMap")
    nameAgeMutableMap["abc"] = 100
    println("nameAgeMutableMap after : $nameAgeMutableMap")

}