package com.example.kotlincourseudemy

fun main(args: Array<String>) {

    Ahmed@ for (i in 1..10) {
        println("i= $i")
        if (i==5)break@Ahmed
        continue
    }


    Mohamed@ for (i in 1..10) {
        Hanem@ for (j in 1..10) {
            println("$i * $j =" + (i * j))
            break@Mohamed

        }
        val r=0
        if (r==5) break@Mohamed
    }


}