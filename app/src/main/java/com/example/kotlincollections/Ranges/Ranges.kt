package com.example.kotlincollections.Ranges

fun main() {
    println("Kotlin Ranges")

    val aTOz = 'a'..'z'
    val oneToNine = 1..9

    println(aTOz)


    for (i in aTOz) {
        print(i + " ")
    }
    println()
    println("One to Nine")
    for (i in oneToNine) {
        print("$i ")
    }


    for (a1 in 5 downTo 1) {
        println(a1)
    }

    // until range

    for (a2 in 1 until 5) {
        print(a2)
    }
    // Let's see an example of integer range using downTo(), downTo, and rangeTo() methods.

}