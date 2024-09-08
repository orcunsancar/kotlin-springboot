package com.kotlinplayground.scopefunctions

import com.kotlinplayground.classes.Course
import com.kotlinplayground.classes.CourseCategory

fun main() {

    exploreApply()
    exploreAlso()
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