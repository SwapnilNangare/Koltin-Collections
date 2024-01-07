package com.example.kotlincollections.KolinOop

fun main() {
    println("Interface")

    /* An interface is a blueprint of class.Kotlin interface is similar to Java 8.
     It contains abstract method declarations as well as implementation of method.
     */

    val obj = InterfaceImp()
    println("Calling overriding id value = ${obj.id}")

    obj.absMethod()
    println(obj.absMethod())

    //
    val MyClass2 = MyClass2()
    MyClass2.absMethod()
    MyClass2.doSomthing()


}

interface MyInterface {

    val id: Int // abstract property

    fun absMethod(): String // abstract method
    fun doSomthing() {
        println("MyInterface doing some work")

        // optional body
    }
}

class InterfaceImp : MyInterface {
    override val id: Int = 101


    override fun absMethod(): String {
        return "Implementing abstract method.."
    }

}

// Implementing multiple interface


interface MyInterface1 {
    fun doSomthing()
}

interface MyInterface2 {
    fun absMethod()

}

class MyClass2 : MyInterface1, MyInterface2 {
    override fun doSomthing() {
        println("overriding doSomthing() of MyInterface1")
    }

    override fun absMethod() {
        println("overriding absMethod() of MyInterface2")
    }

}

// Resolving different Interfaces having same method overriding conflicts

interface MyInterface3 {
    fun doSomthing() {
        println("overriding doSomthing() of MyInterface3")
    }

}

interface MyInterface4 {
    fun doSomthing() {
        println("overriding doSomthing() of MyInterface4")

    }


}

class MyClass3 : MyInterface3, MyInterface4 {

    fun doSomething() {
        super<MyInterface3>.doSomthing()
        // Call the doSomething() implementation from MyInterface3
        // You can also choose to provide a new implementation here
        // println("New implementation in MyClass3")
    }


    override fun doSomthing() {
    }

}