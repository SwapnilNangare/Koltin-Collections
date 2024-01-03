package com.example.kotlincollections

fun main() {
    println("HashMap: hashMapOf()")

    val intMap: HashMap<Int, String> =
        hashMapOf<Int, String>(1 to "Ashu", 4 to "Rohan", 2 to "Ajeet", 3 to "Vijay")
    val stringMap: HashMap<String, String> = hashMapOf<String, String>("name" to "Ashu")

    stringMap.put("city", "Delhi")
    stringMap.put("department", "Development")
    stringMap.put("hobby", "Playing")

    val anyMap: HashMap<Any, Any> = hashMapOf<Any, Any>(1 to "Ashu", "name" to "Rohsan", 2 to 200)

    println(".....traverse intMap........")

    for (key in intMap.keys) {
        println(intMap[key])
    }
    println("......traverse stringMap.......")
    for (key in stringMap.keys) {
        println(stringMap[key])
    }
    println("......traverse anyMap.......")
    for (key in anyMap.keys) {
        println(anyMap[key])
    }

    println("Kotlin hashMapOf() Example 2 - containsKey()")

    println(stringMap.containsKey("name"))

    println("Kotlin hashMapOf() Example 3 - containsValue()")

    println(stringMap.containsValue("Delhi"))
    println(stringMap.containsValue("Mumbai"))

    println("Kotlin hashMapOf() Example 4 - contains()")

    println(stringMap.contains("city"))

    println("Kotlin hashMapOf() Example 5 - replace(key, value)")

    println(stringMap.replace("city", "Mumbai"))

    for (key in stringMap.keys) {
        println("Key = ${key} , value = ${stringMap[key]}")
    }

    println("Kotlin hashMapOf() Example 6 - replace(key, oldValue, newValue)")

    println(stringMap.replace("department", "Development", "Management"))
    for (key in stringMap.keys) {
        println("Key = ${key} , value = ${stringMap[key]}")
    }

    println("Kotlin hashMapOf() Example 7 - hashMapOf().size, hashMapOf().key")
    println(stringMap.size)

    println("Kotlin hashMapOf() Example 8 - getValue(key), getOrDefault(key, defaultValue)")

    println(stringMap.getValue("department"))
    println(stringMap.getOrDefault("name", "Default Value"))

    println("Kotlin hashMapOf() Example 9 - remove(key)")

    println(stringMap.remove("city"))
    for (key in stringMap.keys) {
        println("Key = ${key} , value = ${stringMap[key]}")
    }

    println("Kotlin hashMapOf() Example 11 - set(key, value)")

    stringMap.set("name", "Ashutosh")
    stringMap.set("skill", "Kotlin")

    for (key in stringMap.keys) {
        println("Key = ${key} , value = ${stringMap[key]}")
    }

    println("Kotlin hashMapOf() Example 12 - clear()")
    stringMap.clear()
    println(stringMap)

}