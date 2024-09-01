package com.kotlinplayground.interfaces

import com.kotlinplayground.classes.Course

interface CourseRepository {

    fun getById(id: Int): Course

    fun save(course: Course): Int {
        println("course : $course")
        return course.id
    }

}

interface Repository {

    fun getAll(): Any
}

class SqlCourseRepository : CourseRepository, Repository {
    override fun getById(id: Int): Course {
        return Course(id,
            "Reactive Programming in Modern Java using Project Reactor",
            "Dilip")
    }

    override fun getAll(): Any {
        return 1
    }
}

class NoSqlCourseRepository : CourseRepository {
    override fun getById(id: Int): Course {
        return Course(id,
            "Reactive Programming in Modern Java using Project Reactor",
            "Dilip")
    }

    override fun save(course: Course): Int {
        println("course in NoSqlCourseRepository : $course")
        return course.id
    }
}

interface A {

    fun doSomething() {
        println("doSomething in A")
    }
}
interface B {

    fun doSomething() {
        println("doSomething in B")
    }
}

class AB : A, B {
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("doSomething in AB")
    }

}


fun main() {
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(2)
    println("Course is $course")
    val courseId = sqlCourseRepository.save(Course(5,
            "Reactive Programming in Modern Java using Project Reactor",
            "Dilip"
        )
    )
    println("Saved Course Id is : $courseId")

    val noSqlCourseRepository = NoSqlCourseRepository()
    val course1 = noSqlCourseRepository.getById(2)
    println("Course is $course1")
    val savedCourseId = noSqlCourseRepository.save(
        Course(
            6,
            "Reactive Programming in Modern Java using Project Reactor",
            "Dilip"
        )
    )
    println("Saved Course Id is noSqlCourseRepository : $savedCourseId")

    val ab = AB()
    ab.doSomething()
}