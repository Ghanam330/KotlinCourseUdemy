package com.example.kotlincourseudemy

fun main(args: Array<String>) {

    print("enter your name")
    val x = readLine()!!.toInt()

    if (x > 0)
        println("x is positive")
    else if (x < 0)
        print("x is negative")
    else
        print("x is 0")

// دي نفس الي فوق
    when {
        x > 0 -> println("x is positive")
        x < 0 -> print("x is negative")
        else -> print("x is 0")
    }

    print("Enter Your Degree")
    val  degree= readLine()!!.toInt()

    if (degree>50){
        print("ناجح")
    } else{
        if (degree>=45) println("ناجح بقرار")
        else print("راسب")
    }


}