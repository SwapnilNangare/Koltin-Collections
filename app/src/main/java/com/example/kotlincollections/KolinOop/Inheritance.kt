package com.example.kotlincollections.KolinOop

fun main() {

    println("Inheritance")

    val derived1 = Derived1()
    derived1.foo()

    val duck = Duck()
    duck.fly()
    duck.swim()

    //

    val obj1 = Programmer("Swap", 25, 4000f)
    obj1.doProgram()
    val obj2 = Salesman("Ajay", 44, 3000f)
    obj2.fieldWork()

    //Kotlin Inheritance and primary constructor
    println("Kotlin Inheritance and primary constructor")
    val obj11 = Programmer2("Komal", "Development", 40000f)
    obj11.doProgram()

    val obj12 = Salesman2("Ajay", "Marketing", 3000f)
    obj12.fieldWork()

    //  Kotlin Inheritance and secondary constructor

    println(" Kotlin Inheritance and secondary constructor")

    val obj123 = Child12("Ashu", 101, "Developer")

    println("Kotlin Method Overriding")
    val p = Parrot()
    p.fly()
    val d = Duck2()
    d.fly()

}

open class Employee(name: String, age: Int, salary: Float) {

    init {
        println("Name is $name")
        println("Age is $age")
        println("Salary is $salary")
    }

}

class Programmer(name: String, age: Int, salary: Float) : Employee(name, age, salary) {

    fun doProgram() {
        println("Programming is my passion")
    }

}

class Salesman(name: String, age: Int, salary: Float) : Employee(name, age, salary) {

    fun fieldWork() {
        println("travelling is my hobby.")

    }

}

open class Base1 {

    val x = 10

}

class Derived1 : Base1() {
    fun foo() {
        println("x is equal to " + x)
    }
}

open class Bird {

    fun fly() {
        println("flying...")

    }

}

class Duck : Bird() {
    fun swim() {
        println("swimming...")
    }
}

// Kotlin Inheritance and primary constructor

open class Emp(name: String, salary: Float) {


    init {
        println("Name is $name")
        println("Salary is $salary")


    }
}

class Programmer2(name: String, dept: String, salary: Float) : Emp(name, salary) {
    init {
        println("Name $name of department $dept with salary $salary.")
    }

    fun doProgram() {
        println("Programming is my passion.")

    }

}

class Salesman2(name: String, dept: String, salary: Float) : Emp(name, salary) {

    init {
        println("Name $name of department $dept with salary $salary.")
    }

    fun fieldWork() {
        println("Travelling is my hobby.")

    }
}

// Kotlin Inheritance and secondary constructor

open class Patent {

    constructor(name: String, id: Int) {
        println("execute super constructor $name: $id")

    }
}

class Child12 : Patent {
    constructor(name: String, id: Int, dept: String) : super(name, id) {
        print("execute child class constructor with property $name, $id, $dept")

    }

}


// Kotlin Method Overriding
open class Bird2 {
    open fun fly() {
        println("Bird is flying...")
    }

}

class Parrot : Bird2() {
    override fun fly() {
        println("Parrot is flying...")
    }

}

class Duck2 : Bird2() {
    override fun fly() {
        println("Duck is flying...")
    }
}