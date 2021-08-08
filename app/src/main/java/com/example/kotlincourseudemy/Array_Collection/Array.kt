package com.example.kotlincourseudemy.Array_Collection


fun main(args: Array<String>) {

    val c=IntArray(3)
    c[0]=2
    c[1]=4
    c[2]=7

    val x=DoubleArray(3)
    x[0]=2.3
    x[1]=4.9
    x[2]=7.0

    val y =Array(3){0}
    y[0]=2
    y[1]=4
    y[2]=7

    val v=Array(3){""}
    v[0]="Ahmed"
    v[1]="Mohamed"
    v[2]="Ghanam"

    val z=Array<Int>(3){0}
    z[0]=2
    z[1]=4
    z[2]=7

    val a= arrayOf(2,4,7)
    val l= arrayOf('d',4,"welcome",true)
    val b= arrayOf('s','d','v')
}