package com.example.kotlincollections

fun main() {

    println("Hash Set")

    val hashSet = HashSet<Int>(6)
    hashSet.add(1)
    hashSet.add(2)
    hashSet.add(3)
    hashSet.add(4)
    hashSet.add(5)

    println("......traversing hashSet......")
    for (hs in hashSet) {
        println(hs)
    }

    println("Kotlin HashSet Example 2 - generic")

    var hashSetOf1 = hashSetOf<Int>(2, 13, 6, 5, 2, 8)
    var initSet = hashSetOf<Int>(2, 13, 6, 5, 2, 8)

    var hashSetOf2: HashSet<String> = hashSetOf<String>("Vijay", "Ashu", "Vijay", "Roshan")
    println("......traversing hashSetOf1......")

    for (ele in hashSetOf1) {
        println(ele)
    }
    println("......traversing hashSetOf2......")
    for (element in hashSetOf2) {
        println(element)
    }

    println("Kotlin HashSet Example 3 - add() and addAll()")

    hashSetOf1.add(34)

    println("After adding 34")

    for (ele in hashSetOf1) {
        println(ele)
    }

    hashSetOf1.addAll(initSet)

    for (ele in hashSetOf1) {
        println(ele)
    }


}