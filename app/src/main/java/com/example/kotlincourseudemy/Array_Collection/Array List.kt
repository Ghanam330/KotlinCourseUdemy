package com.example.kotlincourseudemy.Array_Collection

fun main(args: Array<String>) {
    val x=Array(3){0}
    val y =ArrayList<Int>()
    x[0]=3
    y[0]=3
    y.add(3)
    y.add(4)
    y.add(35)
    y.add(3,35)
    y.remove(4)

    y.clear()
}