package com.example.kotlincollections

fun main() {
    println("Mutable List")

    var mutablelist = mutableListOf("Swapnil", "Rutuja", "Komal", "Priti")

    for (ele in mutablelist) {
        println(ele)
    }

    println()

    for (index in 0..mutablelist.size - 1) {
        println(mutablelist[index])
    }

    println("Add elements on mutableList")

    var mutableList1 = mutableListOf("Ajay", "Pratik")
    mutableList1.add("Swapnil")
    mutableList1.add("Karan")

    for (ele1 in mutableList1) {
        println(ele1)
    }

    // Let's see the use of different function of MutableList interface using mutableListOf<T>() function.


    var mutableList12 = mutableListOf<String>()
    mutableList12.add("Ajay")
    mutableList12.add("Vijay")
    mutableList12.add("Prakash")
    var mutableList2 = mutableListOf<String>("Rohan", "Raj")
    var mutableList3 = mutableListOf<String>("Rohan", "Raj")
    var mutableList4 = mutableListOf<String>("Rohan", "Raj")

    println(".....mutableList.....")
    for (element in mutableList12) {
        println(element)
    }
    println(".....mutableList[2].....")
    println(mutablelist[2])
    mutableList12.add(2, "Rohan")

    println("......mutableList.add(2,\"Rohan\")......")
    for (element in mutableList12) {
        println(element)
    }
    mutableList12.add("Ashu")
    println(".....mutableList.add(\"Ashu\")......")
    for (element in mutableList12) {
        println(element)
    }
    mutableList12.addAll(1, mutableList3)
    println("... mutableList.addAll(1,mutableList3)....")
    for (element in mutableList12) {
        println(element)
    }

    mutableList12.addAll(mutableList2)
    println("...mutableList.addAll(mutableList2)....")
    for (element in mutableList12) {
        println(element)
    }
    mutableList12.remove("Vijay")
    println("...mutableList.remove(\"Vijay\")....")
    for (element in mutableList12) {
        println(element)
    }
    mutableList12.removeAt(2)
    println("....mutableList.removeAt(2)....")
    for (element in mutableList12) {
        println(element)
    }

    println(".... mutableList.retainAll(mutableList4)....")
    mutableList12.retainAll(mutableList4)
    for (element in mutableList12) {
        println(element)
    }
    println(".... mutableList2.clear()....")
    mutableList2.clear()

    for (element in mutableList2) {
        println(element)
    }
    println(".... mutableList2 after mutableList2.clear()....")
    println(mutableList2)

    println("....mutableList.subList(1,2)....")
    println(mutableList12.subList(1, 2))


}