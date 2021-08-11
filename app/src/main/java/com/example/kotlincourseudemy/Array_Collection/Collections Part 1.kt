package com.example.kotlincourseudemy.Array_Collection

fun main(args: Array<String>) {

    val x = listOf<Int>(3,7,89,99,8,99)
    val x1 =List(5){0}
    val y = mapOf<Int, String>()
    val z=setOf<Int>(7,89,99,8,99)
    println(x)


    val a=mutableListOf<Int>()
    val b=mutableMapOf<Int,String>()
    val c=mutableSetOf<Int>()

    val s=ArrayList<Int>()
    s.addAll(x)
    s.addAll(2,z)

}