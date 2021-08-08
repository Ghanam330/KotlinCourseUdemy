package com.example.kotlincourseudemy

fun main(args: Array<String>) {
    for (x in 1..10) {
        println("The Multiplication Table of$x:")
        val y = 1
        for (y in 1..10) {
            println("$x*$y=" + (x * y))

        }
    }

    val x="Welcome"
    for (i in x){
        println("Char=$i")
    }
}