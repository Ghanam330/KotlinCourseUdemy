package com.example.kotlincourseudemy.Function

fun main(args: Array<String>) {

    val x = Array(4) { 0 }
    val y = Array(4) { 0 }

    Input(x)
    Output(x)
    Input(y)
    Output(y)

}

fun Input(x: Array<Int>) {
    print("Enter The Elements of Array")
    for (i in 0 until x.size) {
        x[i] = readLine()!!.toInt()

    }
}

fun Output(x: Array<Int>) {
    for (i in 0 until x.size) {
        println("x[$i]=" + x[i])
    }
}