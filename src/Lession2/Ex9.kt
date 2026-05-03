package Lession2

fun main() {
    print("Enter N of Fibbonacci seq: ")
    val n = readln().toInt();

    val nf = fibbonacci(n)
    println("$nf")
}

fun fibbonacci(n: Int): Int {
    if (n == 0) {
        return 0
    } else if (n == 1) {
        return 1
    } else {
        return fibbonacci(n - 1) + fibbonacci(n - 2)
    }
}
