package introduction.task04

/*
    Tasks:
        1. Define a function called wrap() that wraps a String with a prefix and suffix Char
        2. Write a unit test for this function
        3. Let's say prefix and suffix are optional and default to [ and ]
        4. Let's say we need strings as prefixes and suffixes too.
        5. Define a function that can three arguments and return their sum
        6. Write a unit test for this function
        7. Define a function to take any number of arguments and return their sum
 */

/*
    Aspects:
        1. Named arguments
        2. Default arguments
        3. Function overloads
        4. vararg arguments
*/

fun main() {
    println(wrap("Kotlin", suffix = ')'))
    println(wrap("Kotlin", "{{", "}}"))
    println(sum(10, 20, 10))
    println(sum(2, 3))
}

fun wrap(str: String, prefix: Char = '[', suffix: Char = ']'): String {
    println("hello")
    return prefix + str + suffix
}

fun wrap(str: String, prefix: String = "[", suffix: String = "]"): String {
    return prefix + str + suffix
}

fun sum(n1: Int, n2: Int, n3: Int): Int {
    return n1 + n2 + n3
}

fun sum(vararg nums: Int): Int {
    return nums.sum()
}