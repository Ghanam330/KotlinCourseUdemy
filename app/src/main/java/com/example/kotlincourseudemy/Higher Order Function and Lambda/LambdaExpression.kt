package com.example.kotlincourseudemy.Higher

fun main(args: Array<String>) {
    // no parameter
    myLambda()
    myLambda1()
    myLambda2()
    myFun()


   //  parameter

    myFun2(3)
    myLambda4(6)
    myLambda5(10)
    println(myLambda6)
}

// no parameter

fun myFun(): Unit {
    println("Hello")
}

var myLambda: () -> Unit = { -> println("Hello") }
var myLambda1 = { -> println("Hello") }
var myLambda2 = { println("Hello") }


//  parameter

fun myFun2(a: Int) {
    println("a=$a")
}

var myLambda4 = { a: Int -> println("a=$a") }
var myLambda5: (Int) -> Unit = { a -> println("a=$a") }
var myLambda6: (Int) -> String = { a -> "a=$a"}