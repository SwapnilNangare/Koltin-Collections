package com.example.kotlincollections.KolinOop

fun main() {

    println("Nested class and Inner class")
// nested class must be initialize
    println(OuterClass.NestedClass()) // accessing property

    var obj = OuterClass.NestedClass() // object creation
    obj.foo() // access member function

}

class OuterClass {
    //outer class code

    private var name: String = "Ashu"


    class NestedClass {
        //nested class code
        private var id: Int = 101

        fun foo() {
            //  print("name is ${name}") // cannot access the outer class member
            println("Id is ${id}")
        }

    }

}