package com.example.kotlincollections.KolinOop

fun main() {
    println("Kotlin Constructor")

    /*
       There are two types of constructors in Kotlin:
       Primary constructor
       Secondary constructor

       */


    val myClass = MyClass("Swapnil", 12)
    println("id ${myClass.id}")
    println("Name ${myClass.name}")

    // seconday constctor
    val myclass = MClass2("Ashu", 101, "mypassword")

    // this keyword
    val myclass3 = myClass3("Ashu", 101)

    // super keyword
    val obj1 = Child("Rutuja", 101)
    val obj2 = Child("Komal", 101, "mypassword")


}

class MyClass(val name: String, val id: Int) {

    val e_name: String
    var e_id: Int
// Primary constructor with initializer block

    init {
        e_name = name
        e_id = id
        println("Name = ${e_name}")
        println("Id = ${e_id}")

    }

}


// Kotlin secondary constructor
/* In Kotlin, secondary constructor can be created one or more in class. The secondary constructor is created using "constructor" keyword. */

class MClass2(password: String) {

    constructor(name: String, id: Int, password: String) : this(password) {
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${password}")
    }
}

/* Calling one secondary constructor from another secondary constructor of same class
* In Kotlin, one secondary constructor can call another secondary constructor of same class. This is done by using this() keyword.
* */


class myClass3 {

    constructor(name: String, id: Int) : this(name, id, "mypassword") {
        println("this executes next")
        println("Name = ${name}")
        println("Id = ${id}")
    }

    constructor(name: String, id: Int, pass: String) {
        println("this executes first")
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${pass}")
    }
}


// Calling supper class secondary constructor from derived class secondary constructor

open class Parent {

    constructor(name: String, id: Int) {
        println("this executes first")
        println("Name = ${name}")
        println("Id = ${id}")
    }

    constructor(name: String, id: Int, pass: String) {
        println("this executes third")
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${pass}")
    }

}

class Child : Parent {
    constructor(name: String, id: Int) : super(name, id) {
        println("this executes second")
        println("Name = ${name}")
        println("Id = ${id}")
    }

    constructor(name: String, id: Int, pass: String) : super(name, id, "password") {
        println("this executes forth")
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${pass}")
    }
}








