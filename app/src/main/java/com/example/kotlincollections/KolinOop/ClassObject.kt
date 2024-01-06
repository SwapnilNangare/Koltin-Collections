package com.example.kotlincollections.KolinOop

fun main() {
    var obj1 = Account()
//    obj1.acc_no = 123
//    obj1.name = "Swapnil"
//    obj1.amount = 1000000000.233F

    obj1.insert(832345,"Ankit",1000000000.233f) //accessing member function
    println("${obj1.name}") //accessing class property



}

class Animal {
    // class header
    // property
    // member function
}

// class with constructor

class className constructor() {  // class header
    // property
    // member function

}

class Account {
    var acc_no: Int = 0
    var name: String? = null
    var amount: Float = 0f


    fun insert(ac: Int, n: String, am: Float) {
        acc_no = ac
        name = n
        amount = am
        println("Account no: ${acc_no} holder :${name} amount :${amount}")
    }

    fun deposit() {
        // deposit
    }

    fun withdraw() {
        // withdraw code
    }

    fun checkBalance() {
        // balance code
    }

    /* Kotlin Object
    Object is real time entity or may be a logical entity which has state and behavior. It has the characteristics:

    state: it represents value of an object.
    behavior: it represent the functionality of an object.

  */


}

