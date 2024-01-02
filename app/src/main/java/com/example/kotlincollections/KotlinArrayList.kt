package com.example.kotlincollections

fun main() {
    println("Kotlin ArrayList")

    val arrayList = ArrayList<String>()
    arrayList.add("Ajay")
    arrayList.add("Komal")
    arrayList.add("Swapnil")
    arrayList.add("Rutuja")
    arrayList.add("Mayur")
    println(".......print ArrayList.......")
    for (ele in arrayList) {
        println(ele)
    }

    println(" initialize ArrayList capacity")


    val arrayList2 = ArrayList<String>(5)
    arrayList2.add("one")
    arrayList2.add("two")
    arrayList2.add("three")
    arrayList2.add("four")
    arrayList2.add("five")
    arrayList2.add("six")

    for (ele2 in arrayList2) {
        println(ele2)
    }
    println("size of arrayList2 = " + arrayList2.size)

    println("filled elements in ArrayList using collection")

    val arrayList3: ArrayList<String> = ArrayList<String>(5)
    val list: MutableList<String> = mutableListOf<String>()

    list.add("Ajay")
    list.add("Vijay")
    list.add("Prakash")

    arrayList3.addAll(list)
    println("......print ArrayList......")
    val itr = arrayList3.iterator()

    while (itr.hasNext()) {
        println(itr.next())
    }
    println("size of arrayList = " + arrayList3.size)

    println("use of getFunction  in arrayList")

    val arrayList12: ArrayList<String> = ArrayList<String>(5)


    arrayList12.add("Ajay")
    arrayList12.add("Vijay")
    arrayList12.add("Prakash")
    arrayList12.add("Rohan")
    arrayList12.add("Vijay")

    println(".......print ArrayList12.......")


    for (i in arrayList12) {
        println(i)
    }

    println(".......arrayList12.get(2).......")
    println(arrayList12.get(2))


    println("Kotlin ArrayList Example 5 - set()")

    arrayList12.set(2, "Ashu")

    for (i in arrayList12) {
        println(i)
    }

    println("Kotlin ArrayList Example 6 - indexOf()")

    println(arrayList12.indexOf("Vijay"))

    println("Kotlin ArrayList Example 7 - lastIndexOf()")

    println(arrayList12.lastIndexOf("Vijay"))

    println("Kotlin ArrayList Example 8 - remove()")
    println(arrayList12.remove("Vijay"))
// The remove () function of ArrayList class is used to remove the first occurrence of element if it is present in the list. For example:
    for (i in arrayList12) {
        println(i)
    }

    println("Kotlin ArrayList Example 9 - removeAt()")

    //The removeAt() function of ArrayList class is used to remove the element of specified index from the list. For example:

    arrayList12.removeAt(3)
    for (i in arrayList12) {
        println(i)
    }

    println("Kotlin ArrayList Example 10 - clear()")
    arrayList12.clear()

        for (ii in arrayList12){
            println(ii)
        }

    println(arrayList12)


}