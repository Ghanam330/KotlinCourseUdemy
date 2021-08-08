package com.example.kotlincourseudemy

fun main(args: Array<String>) {

   tr@ while (true){
        try {
            print("Enter your Age:")
            val  age = readLine()?.toInt()
            println("Your Age Is $age Years")
            break@tr
        }catch (error:Exception){
            print("your enter wrong value")
            continue@tr
        }
    }

    print("Done")

}
