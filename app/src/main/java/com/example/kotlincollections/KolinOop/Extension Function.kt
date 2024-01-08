package com.example.kotlincollections.KolinOop

fun main() {
    println("Extension Function")
    val student = Student()

    val passingStatus = student.isPassed(55)
    println("student passing status is $passingStatus")

    val excellentStatus = student.isExcellent(95)
    println("student excellent status is $excellentStatus")

    val list = mutableListOf(5, 10, 15)
    println("before swapping the list :$list")
    val result = list.swap(0, 2)
    println("after swapping the list :$result")

}

class Student {
    fun isPassed(mark: Int): Boolean {
        return mark > 40
    }
}

fun Student.isExcellent(mark: Int): Boolean {
    return mark > 90
}

fun MutableList<Int>.swap(index1: Int, index2: Int): MutableList<Int> {
    val temp = this[index1]  // this represents to the list
    this[index1] = this[index2]
    this[index2] = temp
    return this
}