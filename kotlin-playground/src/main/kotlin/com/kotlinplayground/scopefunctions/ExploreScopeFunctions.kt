package com.kotlinplayground.scopefunctions

import com.kotlinplayground.classes.Course
import com.kotlinplayground.classes.CourseCategory

fun main() {

   // exploreApply()
   // exploreAlso()
   //  exploreLet()
    // exploreWith()
    exploreRun()
}

fun exploreRun() {

    var numbers : MutableList<Int>? = null
    val result = numbers.run {

        numbers = mutableListOf(1, 2, 3, 4, 5)
        numbers?.sum()
    }

    println("Run Result is : $result")

    val length = run {
        val name = "Dilip"
        println(name)
        name.length
    }

    println("Run length is $length")
}

fun exploreWith() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)

    val result = with(numbers) {
        /*println("Size is ${numbers.size}")
        val list = numbers.plus(6)
        list.sum()*/
        println("Size is $size")
        sum()
    }

    println("With Result is : $result")
}

fun exploreLet() {

    val numbers = mutableListOf(1, 2, 3, 4, 5)
    val result = numbers.map { it * 2 }.filter { it > 5 }. let {
        println(it)
        it.sum()
    }
    println(result)

    var name : String? = null
    name = "Dilip"
    val result1 = name?.let {
        println(it)
        it.uppercase()
    }
    println(result1)
}

fun exploreApply() {

    val course = Course(1,
        "Design Thinking in Kotlin",
        "Dilip"
    ).apply {
        courseCategory = CourseCategory.DESIGN
        //this.courseCategory = CourseCategory.DESIGN
    }

    println("Course : $course")
}

fun exploreAlso() {

    val course = Course(1,
        "Design Thinking in Kotlin",
        "Dilip"
    ).apply {
        courseCategory = CourseCategory.DESIGN
        //this.courseCategory = CourseCategory.DESIGN
    }.also {
        //it.courseCategory = CourseCategory.DESIGN
        //this.courseCategory = CourseCategory.DESIGN
        println("Course : $it")
    }

    //println("Course : $course")
}