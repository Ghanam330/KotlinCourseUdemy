package com.example.kotlincourseudemy

fun main(args: Array<String>) {
    val str ="welcome"
    println("str1 $str")

    println("str2:"+ str.plus("my friend"))
    println("str3:"+ str.hashCode())
    println("str4:"+ str.equals("welcome"))
    println("str5:"+ str.length)
    println("str6:"+ str.count())
    println("str7:"+ str.drop(3))
    println("str8:"+ str.take(3))
    println("str9:"+ str.removeRange(3,4))
    println("str10:"+ str.toUpperCase())
    println("str11:"+ str.toLowerCase())
    println("str12:"+ str.first())
    println("str13:"+ str.last())
    println("str14:"+ str.replace('w','W'))
    println("str15:"+ str.replace("welcome","hello"))
    println("str16:"+ str.replace("come","1"))
}