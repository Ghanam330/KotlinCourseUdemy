package com.example.kotlincourseudemy.Function

fun main(args: Array<String>) {
    tr@while(true){
        try {
            println("Enter your Age :")
            val age =readLine()!!.toInt()
            println(" your age is $age Years ")
            break@tr
        }catch(e:NumberFormatException){
           println("Please enter integer number: ")

            continue@tr
        }catch (e:ArithmeticException){
            println("Your entered wrong value ")
            continue@tr
        }
    }
    print("Done")

}