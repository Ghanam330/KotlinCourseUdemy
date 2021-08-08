package com.example.kotlincourseudemy.Array_Collection

fun main(args: Array<String>) {

    val x = arrayOf(2, 'a', "Hello", 3.99)

    println("Enter The Value of Array")

    for (i in 0 until x.size){
        x[1]=readLine()!!
    }


    println(x[0])
    for (i in 0..3) {
        println(x[i])

    }

    for (i in 0 until x.size) {
        println("x ["+(i + 1)+"]="+x[i])

    }

    // دي شبه الي فوق

    x.indices.forEach { i ->
        println("x ["+(i + 1)+"]="+x[i])
    }


}