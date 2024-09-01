package com.kotlinplayground.classes

class Person(
    val name: String = "",
    val age: Int = 0
) {

    fun action() {
        println("Person Walks")
    }
}

fun main() {
    val person = Person("Alex", 25)
    person.action()
    println("Name : ${person.name}  and the age is ${person.age}")

    val person1 = Person()
    println("Name : ${person1.name}  and the age is ${person1.age}")
}