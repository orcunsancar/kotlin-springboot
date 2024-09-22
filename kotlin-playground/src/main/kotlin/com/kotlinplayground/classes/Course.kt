package com.kotlinplayground.classes

import com.kotlinplayground.CourseJava

data class Course(
    val id: Int,
    val name: String,
    val author: String,
    var courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
)

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

fun main() {

    val course = Course(1,
        "Reactive Programming in Modern Java using Project Reactor",
        "Dilip")

   println(course)

    val course1 = Course(2,
        "Reactive Programming in Modern Java using Project Reactor",
        "Dilip")

    println("Checking object equality : ${course == course1}")

    val course3 = course1.copy(
        id = 2, author = "Dilip1"
    )

    println(course3)

    val marketingCourse = Course(2,
        "Facebook Marketing",
        "Dilip",
        CourseCategory.MARKETING)
    println(marketingCourse)

    val courseJava = CourseJava(1, "Reactive Programming in Modern Java using Project Reactor", "Dilip")
    courseJava.id = 1
    courseJava.name = "ABC"
    courseJava.author = "Dilip"

    courseJava.printCourse()
}