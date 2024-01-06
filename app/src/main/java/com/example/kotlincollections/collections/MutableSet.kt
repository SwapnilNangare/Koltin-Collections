package com.example.kotlincollections.collections

fun main() {
    println("Mutable Set")

    /* Kotlin MutableSet interface is a generic unordered collection of elements. MutableSet interface does
    not support duplicate elements. This interface is mutable so its methods support read-write functionality supports adding and
    removing elements */

    val intmutableSet = mutableSetOf<Int>(2, 4, 5, 6, 7, 8, 9, 4)
    val anymutableSet: Set<Any> = setOf(2, 3, 4, 5, 6, 6, 7, 4, "Ajay", "Ashu", "Ajay")
    println("....intmutableSet....")

    for (ele in intmutableSet) {
        println(ele)
    }
    println("....anymutableSet......")

    for (ele in anymutableSet) {
        println(ele)
    }

    println("Kotlin MutableSet Interface Example 2 - add() and addAll()")

    intmutableSet.add(10)

    for (ele in intmutableSet) {
        println(ele)

    }
    val mutableSet: MutableSet<Int> = mutableSetOf<Int>(6, 8, 11, 22)


    intmutableSet.addAll(mutableSet)

    for (ele in intmutableSet) {
        println(ele)

    }

    println("Kotlin MutableSet Interface Example 3 - remove() and removeAll()")

    intmutableSet.remove(4)

    for (ele in intmutableSet) {
        println(ele)
    }
    println("RemoveAll")
    intmutableSet.removeAll(mutableSet)
    for (ele in intmutableSet) {
        println(ele)
    }

    println("Kotlin MutableSet Interface Example 4 - contains() and containsAll()")

    val mutableSet1 = mutableSetOf<Int>(2, 6, 4, 29, 4, 5)
    val mutableSet2: MutableSet<Int> = mutableSetOf<Int>(6, 8, 11, 22)
    val mutableSet3: MutableSet<Int> = mutableSetOf<Int>(2, 4, 6)

    println("....mutableSet1....")

    for (element in mutableSet1) {
        println(element)
    }
    println("....mutableSet2....")
    println(mutableSet2)
    println("....mutableSet3....")
    println(mutableSet3)
    println("....mutableSet1.contains(29)....")

    println(mutableSet1.contains(29))

    println("....mutableSet1.containsAll(mutableSet2))....")
    println(mutableSet1.containsAll(mutableSet2))

    println("....mutableSet1.containsAll(mutableSet3))....")
    println(mutableSet1.containsAll(mutableSet3))

    println("Kotlin MutableSet Interface Example 5 - isEmpty() and any()")

    println(mutableSet1.isEmpty())
    println(mutableSet1.any())

    println("Kotlin MutableSet Interface Example 6 - first(), indexOf() and drop()")

    println(mutableSet1.first())
    println(mutableSet1.indexOf(4))
    println(mutableSet1.drop(3))




}