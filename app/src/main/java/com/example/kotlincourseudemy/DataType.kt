package com.example.kotlincourseudemy

fun main(args: Array<String>) {


    // val مينفعشي اغير المتغير
    // var    قابل التعديل


    var str: String
    str = "Welcome to Kotlin"
    println("str: ${str[1]!!}")
    println("str: ${str[1]}")



    var d: Char = 's'
    val name = "Hussein"
    val age = 30
    val GPA = 3.8


    println("===== User info ===== ")
    println("Name: $name")
    println("Age: $age")
    println("Age: " + age)
    println("GPA: $GPA")
    println("d: $d")


    var count = 1
    println("Count: $count")
    count = 10
    println("Count: $count")


    var department: String?
    department = null
    department = "Software Engineering"
    print("Department $department")
    print("Department ${department!!}")

}