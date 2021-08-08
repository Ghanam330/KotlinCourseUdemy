package com.example.kotlincourseudemy.Array_Collection

fun main(args: Array<String>) {

    val x = ArrayList<Int>()
    x.add(0)
    x.add(9)
    x.add(70)
    x.add(5)
    x.add(4)
    println("x. size=" + x.size)
    println("x.lastIndexOf(3)" + x.lastIndexOf(3))
    println("x.first()="+x.first())
    println("x.last"+x.last())
    println("x.indexof()"+x.indexOf(6))
    println("x.isEmpty()"+x.isEmpty())
    println("x.isNotEmpty()"+x.isNotEmpty())
    println("x.contains()"+x.contains(4))
    println("x.toString()${x.toString()}")
    println("x.set(4,5)"+x.set(4,5))
    println("x.get(4)"+x.get(4))
    x.toArray()
    x.clear()
    println("x.size"+x.size)

}
