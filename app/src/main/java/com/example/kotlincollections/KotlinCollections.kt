package com.example.kotlincollections

fun main() {
    println("Kotlin Collections")

    /*
    * Types of Kotlin Collections 1-> Immutable Collection (or Collection) 2-> Mutable Collection
    * Immutable collection also called Collection supports read only functionalities
    * 1.Immutable Collection:-> List,Map,Set
    * 2.Mutable Collection:-> Mutable collections supports both read and write functionalities. -> List,Map,Set
    *
    * */

    // List Example
    val list = listOf("Ajay", "Vijay", "Prakash")

    for (elelist in list) {
        println(elelist)
    }


    // In the listOf() function we can pass the different types of data at the same time. List can also traverse the list using index range

    val list2 = listOf(1, 2, "Swapnil", "Rutuja")

    for (list2 in list2) {
        println(list2)
    }
    println()
    for (index in 0..list2.size - 1) {
        println(list2[index])
    }


    // For more specific we can provide the generic types of list such as listOf<Int>(), listOf<String>(), listOf<Any>() Let's see the example.

    var intList: List<Int> = listOf(1, 2, 3, 4, 5)
    var stringList: List<String> = listOf("Swapnil", "Nangare")
    var anyList: List<Any> = listOf(55, 66, 77, "Rutuja", "Swapnil")

    println("print int list")

    for (intList in intList) {
        println(intList)
    }

    println("Elements of StringList")
    for (stringList in stringList) {
        println(stringList)
    }


    println("Elements of anyList")
    for (anyList in anyList) {
        println(anyList)
    }

    // Let's see the use of different function of Kotlin list interface using listOf<T>() function.

    println("Operations of List")
    var stringList1: List<String> = listOf("Ajay", "Vijay", "Prakash", "Vijay", "Rohan")
    var list1: List<String> = listOf("Ajay", "Vijay", "Prakash")

    for (element in stringList1) {
        print(element + " ")
    }
    println()

    println(stringList1.get(0))
    println(stringList1.indexOf("Prakash"))
    println(stringList1.lastIndexOf("Vijay"))
    println(stringList1.size)
    println(stringList1.contains("Rohan"))
    println(stringList.containsAll(list1))
    println(stringList1.subList(2, 4))
    println(stringList1.isEmpty())
    println(stringList1.drop(1))
    println(stringList.dropLast(2))


    /*
    The limitation of List interface is that it is
    immutable. It cannot add more elements in list after its declaration. To solve
    this limitation Collection framework provide mutable list.
     */


}