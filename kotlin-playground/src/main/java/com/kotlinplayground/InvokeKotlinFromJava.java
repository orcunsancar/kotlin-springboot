package com.kotlinplayground;

import com.kotlinplayground.classes.Course;
import com.kotlinplayground.classes.CourseCategory;

public class InvokeKotlinFromJava {

    public static void main(String[] args) {

        var course = new
                Course(1,
                "Reactive Programming in Modern Java using Project Reactor",
                "Dilip",
                 CourseCategory.DEVELOPMENT);

        System.out.println("course: " + course);
    }
}
