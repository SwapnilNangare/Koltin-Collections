package com.example.kotlincollections.collections

fun main() {

    println("Set ")

    val intSet = setOf(2, 6, 7, 8, 9, 10)
    val mySet: Set<Any> = setOf(2, 6, 4, 29, 4, 5, "Ashu", "Ajay")

    println(".......print Int set.........")

    for (element in intSet) {
        println(element)
    }

    println(".......print Any set.........")
    for (element in mySet) {
        println(element)
    }

    println("Kotlin Set Interface Example 2 - contains() and containsAll()")

    println(".......print Any set.........")
    for (element in mySet) {
        println(element)
    }

    println(mySet.contains("Ashu"))
    println("...mySet.contains(20)...")
    println(mySet.contains(20))
    println("...mySet.containsAll(intSet)...")
    println(mySet.containsAll(intSet))

    println("Kotlin Set Interface Example 3 - isEmpty() and isNotEmpty()")

    println(mySet.isEmpty())
    println(mySet.isNotEmpty())

    println("Kotlin Set Interface Example 4 - drop()")

    val remainList = mySet.drop(4)
    println(".......print Set after mySet.drop(4).........")

    for (element in remainList) {
        println(element)
    }

    println("Kotlin Set Interface Example 5 - elementAt() and elementAtOrNull()")

    println(mySet.elementAt(1))
    println(mySet.elementAtOrNull(5))



}