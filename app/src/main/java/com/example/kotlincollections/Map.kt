package com.example.kotlincollections

fun main() {
    println("Map")

    /*Kotlin Map is an interface and generic collection of elements. Map interface holds data in the form of key and value pair.
     Map key are unique and holds only one value for each key. The key and value may be of different pairs such as <Int, Int>,<Int, String>,
     <Char, String>etc. This interface is immutable, fixed size and its methods support read only access. */


    val myMap = mapOf<Int, String>(1 to "one", 2 to "Two", 3 to "Three")

    for (key in myMap.keys) {
        println(myMap[key])
    }

    println("For more specific we can provide generic type Map such as myMap: Map<k, v> = mapOf<k,v>()")

    val myMap2: Map<Int, String> = mapOf<Int, String>(1 to "Ajay", 4 to "Vijay", 3 to "Prakash")
    for (key in myMap2.keys) {
        println("Elements at the $key =${myMap2.get(key)}")
    }

    println("non generic ")
    val myMap3 = mapOf(1 to "Ajay", 4 to "Vijay", 3 to "Prakash", "ram" to "Ram", "two" to 2)

    for (key in myMap3.keys) {
        println("Element at key $key = ${myMap3.get(key)}")
    }


    println("Kotlin Map Interface Example 4 - mapOf().getValue()")
    println(myMap3.getValue(4))

    println("Kotlin Map Interface Example 5 - mapOf().contains()")
    println(myMap3.containsKey(1))

    println("Kotlin Map Interface Example 6 - mapOf().containsKey()")
    println(myMap3.containsKey(3))

    println("Kotlin Map Interface Example 7 - mapOf().containsValue ()")
    println(myMap3.containsValue("Swapnil"))

    println("Kotlin Map Interface Example 8 - mapOf().get()")
    println(myMap3.get(1))

    println("Kotlin Map Interface Example 9 - mapOf().getOrDefault ()")
    println(myMap3.getOrDefault(3, "Vijay"))

    println("Kotlin Map Interface Example 10 - mapOf().asIterable ()")

    for (itr in myMap3.asIterable()) {
        println("Key =${itr.key} value =${itr.value}")
    }

    println("Kotlin Map Interface Example 11 - mapOf().iterator()")

    for (itr1 in myMap3.iterator()) {
        println("key = ${itr1.key} value = ${itr1.value}")
    }

    println("Kotlin Map Interface Example 12 - mapOf().minus()")

    for (m in myMap3.minus(4)) {
        println(myMap3[m.key])
    }
    println("Kotlin Map Interface Example 13 - mapOf().plus()")
    for(p in myMap3.plus(Pair(5, "Rohan"))){
        println("Element at key ${p.key} = ${p.value}")
    }



}