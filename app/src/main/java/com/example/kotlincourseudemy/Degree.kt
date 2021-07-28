package com.example.kotlincourseudemy


fun main(args: Array<String>) {

    println("Enter your Degree:")

    val  degree = readLine()!!.toInt()





    // --------------<>----------------

    var  x =10

    while (x>1){
        println("Hello")
        x--
        // او دي
       // x-=1
    }

    // --------------<>----------------

    when(degree) {
        in 90..100 ->{
            if (degree >94)
                println("+A")
            else println("-A")
        }

        in 80..90 ->{
            if (degree>94)
                println("+B")
            else
                println("-B")
        }
    }


      // الفوق دي نفس ال تحت

    if (degree>=90) println("A")
    else if (degree>=80) println("A")
    else if (degree>=70) println("B")
    else if (degree>=60) println("C")
    else if (degree>=50) println("E")
    else println("F")

 // --------------<>----------------




    if (degree>=90) println("A")
    else if (degree>=80 && degree<89) println("A")
    else if (degree>=70&& degree<80) println("B")
    else if (degree>=60&& degree<70) println("C")
    else if (degree>=50&& degree<60) println("E")
    else println("F")

    // الفوق دي نفس ال تحت

    if (degree>=90) println("A")
    else if (degree in 80..88) println("A")
    else if (degree in 70..79) println("B")
    else if (degree in 60..69) println("C")
    else if (degree in 50..59) println("E")
    else println("F")



    // --------------<>----------------

    when {
        degree>=90 ->{
            if (degree >94)
                println("+A")
            else println("-A")
        }

        degree in 80..90 ->{
            if (degree>94)
                println("+B")
            else
                println("-B")
        }
    }


    while (true){
        when {
            degree>=90 -> println("A")
            degree>=80 -> println("A")
            degree>=70 -> println("B")
            degree>=60 -> println("C")
            degree>=50 -> println("E")
            else -> println("F")
        }
    }
}