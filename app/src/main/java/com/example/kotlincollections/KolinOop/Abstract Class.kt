package com.example.kotlincollections.KolinOop

fun main() {
    println("Abstract Class")

    /*A class which is declared with abstract keyword is known as abstract class. An abstract class cannot be
    instantiated. Means, we cannot create object of abstract class. The method and properties of abstract class are non-abstract
     unless they are explicitly declared as abstract. */

    var obj = Honda()
    obj.run()


}

abstract class A {
    var x = 0
    abstract fun doSomething()
}

abstract class Car {
    abstract fun run()

}

class Honda : Car() {
    override fun run() {
        println("Honda is running safely..")

    }
}