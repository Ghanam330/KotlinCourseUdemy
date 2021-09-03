package com.example.kotlincourseudemy.Higher

fun main(args: Array<String>) {
sum(5,4,{a,b->a+b})
sum(5,4,::myFun2)
}

fun sum (a:Int, b:Int,myFun:(Int,Int)->Int){
    println("sum ="+myFun(a,b))

}

fun myFun2(a:Int ,b:Int):Int{
    return a+b
}