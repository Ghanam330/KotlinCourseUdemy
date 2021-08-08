package com.example.kotlincourseudemy


fun main(args: Array<String>) {
   print("ادخل سنه الميلاد")

    val birth = readLine()!!.toInt()

    val age = 2021 - birth
    println("your age is: $age year")

}
