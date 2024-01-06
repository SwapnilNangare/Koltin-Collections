package com.example.kotlincollections.KolinOop

fun main() {
    println("Kotlin Inner class")


    /*  Inner class is a class which is created inside another class with keyword inner. In other words, we can say that a nested class
        which is marked as "inner" is called inner class.
        Inner class cannot be declared inside interfaces or non-inner nested classes. */

    println(OuterClass1().InnerClass().description) // accessing property
    var obj = OuterClass1().InnerClass() // object creation
    obj.foo() // access member function
}


    class OuterClass1 {
        private var name = "Swapnil"

        inner class InnerClass {
            var description: String = "code inside inner class"
            private var id: Int = 123
            fun foo() {
                println("name is $name")
                println("id is ${id}")
            }

        }
    }


