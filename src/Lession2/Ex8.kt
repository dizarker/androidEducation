package Lession2

fun main() {
    print("Enter the number: ")
    val n = readln().toInt();

    for (i in 1..n + 1) {
        println("$n * $i = ${n * i}")
    }
}