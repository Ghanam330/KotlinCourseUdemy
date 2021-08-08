package com.example.kotlincourseudemy.Array_Collection

fun main(args: Array<String>) {
    val a = arrayOf(58, 5, 15, 3, 25, 5, 99, 1, 6)
    println("Max Element :" + a.max())
    println("Min Element :" + a.min())
    println("Count Element :" + a.count())
    println("size Element :" + a.size)
    println("first Element :" + a.first())
    println("last Element :" + a.last())

    println("set Element ; update index 3 by value 333")

    a[3] = 333     //دي نفس الي تحتها
    a.set(3, 333)

    ///////////////

    println("get Element :"+a.get(3))
    println("get Element :"+a.sort())

    for (i in 0 until a.size){
        println("Ar[$i]"+a[i])
    }
}