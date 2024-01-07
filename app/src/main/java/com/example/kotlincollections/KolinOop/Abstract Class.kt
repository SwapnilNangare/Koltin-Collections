package com.example.kotlincollections.KolinOop

fun main() {
    println("Abstract Class")

    /*A class which is declared with abstract keyword is known as abstract class. An abstract class cannot be
    instantiated. Means, we cannot create object of abstract class. The method and properties of abstract class are non-abstract
     unless they are explicitly declared as abstract. */

    var obj = Honda()
    obj.run()

    println("Example of real scenario of abstract class")

    var sbi: Bank = SBI()
    val sbiint = sbi.simpleInterest(1000, 5.0, 3)
    println("SBI interest is $sbiint")
    var pnb: Bank = PNB()
    val pnbint = pnb.simpleInterest(1000, 4.5, 3)
    println("PNB interest is $pnbint")


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

// Example of real scenario of abstract class

abstract class Bank {
    abstract fun simpleInterest(p: Int, r: Double, t: Int): Double

}

class SBI : Bank() {
    override fun simpleInterest(p: Int, r: Double, t: Int): Double {
        return (p * r * t) / 100
    }

}

class PNB : Bank() {
    override fun simpleInterest(p: Int, r: Double, t: Int): Double {
        return (p * r * t) / 100
    }

}