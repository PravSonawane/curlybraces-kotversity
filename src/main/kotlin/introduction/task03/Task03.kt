package introduction.task03

/*
    Tasks:
        1. Define a function printString() that prints "Kotlin"
        2. Change the function to take a string parameter and make it print that
        3. Define a new function add() that takes two params and returns their sum
        4. Write a unit test for add()
 */

/*
    Aspects:
        1. Defining function syntax
            a. Regular style
            b. Expression body
            c. Inferred return type
        2. Function parameters
            a. Parameter type is after its name
        3. No primitive types in Kotlin
*/

fun main() {

    val messageString = "Kotlin"
    printString(messageString)
    println(add(3, 7)) // primitives, this, return types of lambdas
}

fun printString(message: String) {
    println(message)
}

fun add(a: Int, b: Int) = a + b