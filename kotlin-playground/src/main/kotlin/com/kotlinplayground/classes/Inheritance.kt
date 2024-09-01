package com.kotlinplayground.classes

open class User(val name: String) {

    fun login() {
        println("Inside user Login")
    }
}

class Student(name: String) : User(name)

class Instructor(name: String) : User(name)

fun main() {

    val student = Student("Alex")
    println("name is: ${student.name}")
    student.login()

    val instructor = Instructor("Dilip")
    println("name is: ${instructor.name}")
    instructor.login()
}