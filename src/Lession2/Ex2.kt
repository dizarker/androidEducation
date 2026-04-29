package Lession2

fun main() {
    print("Enter a number: ")
    val number = readln().toInt()
    if (number % 2 == 0) {
        println("Number is even")
    } else {
        println("Number is odd")
    }
}
