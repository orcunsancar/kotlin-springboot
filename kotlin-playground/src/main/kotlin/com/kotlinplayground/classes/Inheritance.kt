package com.kotlinplayground.classes

open class User(val name: String) {
    open var isLoggedIn: Boolean = false
    open fun login() {
        println("Inside user Login")
    }

    private fun secret() {
        println("Inside user Secret")
    }

    protected open fun logout() {
        println("Inside user Logout")
    }
}

class Student(name: String) : User(name) {
    override var isLoggedIn: Boolean = false

    companion object {
        const val noOfEnrolledCourses = 10
        fun country() = "USA"
    }
    override fun login() {
        println("Inside Student Login")
        super.login()
    }

    public override fun logout() {
        super.logout()
        println("Inside Student Logout")
    }
}

class Instructor(name: String) : User(name)

fun main() {

    val student = Student("Alex")
    println("name is: ${student.name}")
    student.login()
    student.isLoggedIn = true
    println("Logged in values is: ${student.isLoggedIn}")
    student.logout()

    val country = Student.country()
    println("Country is: $country")

    println("noOfEnrolledCourses is: ${Student.noOfEnrolledCourses}")

    val instructor = Instructor("Dilip")
    println("name is: ${instructor.name}")
    instructor.login()

    val user = User("Dilip")

}