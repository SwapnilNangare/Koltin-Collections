package com.example.kotlincollections.KolinOop

fun main() {
    println("Visibility Modifier")

    /* public
    protected
    internal
    private

   1.protected modifier -> A protected modifier with class or interface allows visibility to its class or subclass only.
    A protected declaration (when overridden) in its subclass is also protected modifier unless it is explicitly changed.

   2.internal modifier -> The internal modifiers are newly added in Kotlin, it is not available in Java.
     Declaring anything makes that field marked as internal field. The internal modifier makes the field visible only
     inside the module in which it is implemented.

   3.private modifier -> A private modifier allows the declaration to be accessible only within the block in which properties,
   fields, etc. are declare. The private modifier declaration does not allow to access the outside the scope.
    A private package can be accessible within that specific file.

    4.



 */

    val obj = Example()
    obj.x
    obj.getValue()

    //

    val base = Base()
    // base.a and base.d are visible
    // base.b, base.c and base.e() are not visible
    val derived = Derived()
    // derived.c is not visible
}

internal class Example {
    internal val x = 5
    internal fun getValue() {

        /* In above, all the fields are declared as internal which are accessible only inside the module in which they are implemented */
    }
}

internal val y = 10

open class Base() {
    var a = 1 // public by default
    private var b = 2 // private to Base class
    protected open val c = 3  // visible to the Base and the Derived class
    internal val d = 4 // visible inside the same module
    protected fun e() {} // visible to the Base and the Derived class
}

class Derived : Base() {
    // a, c, d, and e() of the Base class are visible
    // b is not visible
    override val c = 9 // c is protected
}

