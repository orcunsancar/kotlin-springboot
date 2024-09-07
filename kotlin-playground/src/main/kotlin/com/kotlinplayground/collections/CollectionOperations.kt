package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.courseList

fun main() {
    val courseList = courseList()

    val devPredicate = {c: Course -> c.category == CourseCategory.DEVELOPEMENT}
    val desPredicate = {c: Course -> c.category == CourseCategory.DESIGN}

    exporeFilter(courseList, desPredicate)
}

fun exporeFilter(courseList: MutableList<Course>,
                 predicate: (Course) -> Boolean) {

    val developmentCourses = courseList
        //.filter { it.category ==  CourseCategory.DEVELOPEMENT }
        .filter { predicate.invoke(it) }
        .forEach {
            println("Courses : $it")
        }
}
