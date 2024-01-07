package com.example.kotlincollections.KolinOop

fun main() {
    println("Data Class")

    /* Data class is a simple class which is used to hold data/state and contains standard
     functionality. A data keyword is used to declare a class as a data class

     Data class internally contains the following functions:
     equals(): Boolean
     hashCode(): Int
     toString(): String
     component() functions corresponding to the properties
     copy()

     Due to presence of above functions internally in data class, the data class eliminates the boilerplate code.

     Requirements of data class
     In order to create a data class, we need to fulfill the following requirements:

    Contain primary constructor with at least one parameter.
    Parameters of primary constructor marked as val or var.
    Data class cannot be abstract, inner, open or sealed.
    Before 1.1,data class may only implements interface. After that data classes may extend other classes.


    */

    val u = User("Swapnil", 123, "swa123@gmail.com")
    println(u)

}

data class User(var name: String, var id: Int, var email: String)