package com.example.kotlincourseudemy.Array_Collectionm;

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>) {
    val a=mapOf<Int, String>()
    val b=mutableMapOf<Int,String>()
    b.set(1,"ahmed")
    b[2] = "ahmed"
    b.get(1)
    b[2]

    b.put(1, "f")

    b.replace(2,"k")
    val c=mutableMapOf<String,Int>()
    c["mohaemd"]=33

}