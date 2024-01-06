package com.example.kotlincollections.collections

fun main() {
    println("Kotlin Array")


    // initializes of array

    var myArray = Array<Int>(5) { 0 }


    var myArray1 = arrayOf(1, 2, 3, 4, 5)
    var myArray2 = arrayOf<Int>(1, 5, 10, 15, 20)
    var myArray3 = arrayOf<String>("Swapnil,Sagar,Raju,Dilip", "Sumit")
    var myArray4 = arrayOf(1, 10, "Ajay", "Prakesh")

    // Kotlin array declaration - using arrayOf function

    var myArray5: IntArray = intArrayOf(5, 10, 20, 12, 15)


    // we will see how to initialize and traverse its elements

    for (ele in myArray) {
        println(ele)
    }
    println("myArray 1")

    for (element1 in myArray1) {
        println(element1)
    }
    println("myArray 2")

    for (element2 in myArray2) {
        println(element2)
    }

    println("myArray 3")

    for (element3 in myArray3) {
        println(element3)
    }


    println("myArray 4")

    for (element4 in myArray4) {
        println(element4)
    }

    var meArray = Array<Int>(5) { 0 }

    meArray[0] = 20
    meArray[1] = 30

    println("meArray all elements")
    for (meArray in meArray) {
        println(meArray)
    }

    // traversing using range:
    println("Traversing using range:")

    var myArray51: IntArray = intArrayOf(5, 10, 20, 12, 15)

    for (index in 0..2) {
        println(myArray51[index])
    }

    println()
    for (index in 0..myArray51.size-1){
        println(myArray5[index])
    }


}
