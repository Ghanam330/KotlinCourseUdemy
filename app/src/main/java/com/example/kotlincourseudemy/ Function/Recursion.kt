package com.example.kotlincourseudemy.Function

fun main(args: Array<String>) {
   print("Enter A positive Integer:")
    val x = readLine()!!.toInt()
    println("Sum"+ add(x))


}

fun add(c:Int):Int{
    return if (c !=0) c+add(c-1)
    else
        0
}
