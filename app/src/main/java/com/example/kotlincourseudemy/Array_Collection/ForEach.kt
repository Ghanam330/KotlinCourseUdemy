package com.example.kotlincourseudemy.Array_Collection

fun main(args: Array<String>) {

    val x=arrayOf(2,3,4,5,3.5)
    val y=ArrayList<Int>()
    y.add(49)
    y.add(47)
    y.add(46)
    y.add(450)
    y.add(44)

    for (i in x){
        print(i)
        print("\t")
        print("\t$i")
    }

    for (i in 0 until x.size){
        println("Index${i+1}=${x[i]}")
    }
    x.forEach {
        println(it)
    }
}