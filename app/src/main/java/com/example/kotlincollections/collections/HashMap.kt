package com.example.kotlincollections.collections

fun main() {
    println("Hash Map")

    val hashMap: HashMap<Int, String> = HashMap<Int, String>() //this empty hashMap

    hashMap.put(1, "Ajay")
    hashMap.put(2, "Kunal")
    hashMap.put(3, "Swapnil")
    hashMap.put(4, "Rutuja")

    println(".....traversing hashmap.......")

    for (key in hashMap.keys) {
        println("Elements at $key = ${hashMap[key]}")
    }

    println("Kotlin HashMap Example 2- HashMap initial capacity")

    val hashMap2: HashMap<String, String> = HashMap<String, String>(3)
    hashMap2.put("name", "Ajay")
    hashMap2.put("city", "Delhi")
    hashMap2.put("department", "Software Development")
    println(".....Traversing hashmap.......")

    for (key in hashMap2.keys) {
        println("Element at key : $key = ${hashMap2[key]}")
    }

    println(".....hashMap2.size.......")
    println(hashMap2.size)

    hashMap2.put("hobby", "Travelling")
    println(".....hashMap.size  after adding hobby.......")
    println(hashMap2.size)
    println(".....traversing hashmap.......")
    for (key in hashMap2.keys) {
        println("Element at key $key = ${hashMap2.get(key)}")
    }
    println(hashMap2.size)



    println("Kotlin HashMap Example 3- remove() and put()")

    val hashmap3: HashMap<Int, String> = HashMap<Int, String>()
    hashmap3.put(1, "Swapnil")
    hashmap3.put(4, "Rutuja")
    hashmap3.put(2, "Komal")
    hashmap3.put(3, "Ajay")

    println(".....traversing hashmap.......")

    for (key in hashmap3.keys) {
        println("Element at key $key ${hashMap[key]}")
    }

    hashmap3.replace(3, "Radha")
    hashmap3.put(2, "Raj")

    println(".....hashMap.replace(3,\"Radha\")... hashMap.replace(2,\"Raj\").......")
    for (key in hashmap3.keys) {
        println("Element at key $key ${hashmap3[key]}")
    }

    println("Kotlin HashMap Example 4 - containsKey(key) and containsValue(value)")

    println(hashmap3.containsKey(3))
    println(hashmap3.containsValue("Rohan"))

    println("Kotlin HashMap Example 5 - clear()")

    hashmap3.clear()
    println(".....print hashMap after clear().......")
    println(hashmap3)






}