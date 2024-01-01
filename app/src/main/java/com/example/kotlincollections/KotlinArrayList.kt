package com.example.kotlincollections

fun main() {
    println("Kotlin ArrayList")

    val arrayList=ArrayList<String>()
    arrayList.add("Ajay")
    arrayList.add("Komal")
    arrayList.add("Swapnil")
    arrayList.add("Rutuja")
    arrayList.add("Mayur")

    for(ele in arrayList){
        println(ele)
    }

    
}