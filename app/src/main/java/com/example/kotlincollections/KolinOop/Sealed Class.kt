package com.example.kotlincollections.KolinOop

fun main() {
    println("Sealed Class")

    /* Sealed class is a class which restricts the class hierarchy. A class can be declared as
     sealed class using "sealed" keyword before the class name. It is used to represent restricted class hierarchy.
     Sealed class is used when the object have one of the types from limited set, but cannot have any other type.
     The constructors of sealed classes are private in default and cannot be allowed as non-private. */
    var circle = Shape.Circle(5.0f)
    var square = Shape.Square(5)
    var rectangle = Shape.Rectangle(4, 5)

    eval(circle)
    eval(square)
    eval(rectangle)

}

sealed class Shape {
    class Circle(var radius: Float) : Shape()
    class Square(var length: Int) : Shape()
    class Rectangle(var length: Int, var breadth: Int) : Shape()

    // Sealed class ensures the important of type-safety by restricting the set of types at compile time only.

}

fun eval(e: Shape) =
    when (e) {
        is Shape.Circle -> println("Circle area is ${3.14 * e.radius * e.radius}")
        is Shape.Square -> println("Square area is ${e.length * e.length}")
        is Shape.Rectangle -> println("Rectagle area is ${e.length * e.breadth}")
        //else -> "else case is not require as all case is covered above"
        //  Shape.NotAShape ->Double.NaN
    }

sealed class A1 {
    class B : A1() {
        class E : A1() //this works.
    }

    class C : A1()

    init {
        println("sealed class A")
    }
}

class D : A1() //this works
{
    class F : A1() //This won't work,because sealed class is defined in another scope.
}

// Sealed class with when


