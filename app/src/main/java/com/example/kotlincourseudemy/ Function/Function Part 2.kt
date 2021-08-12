package com.example.kotlincourseudemy.Function

fun main(args: Array<String>) {

    val s = a()
    println("s =$s")
    println("s ="+s(3,6))
}

fun a(): Int {
    val a = 10
    val y = 10

    return a * y
}

fun s(s:Int,b:Int):Int{
    return s * b
}