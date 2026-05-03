package Lession2

fun main() {
    println("Enter numbers. For end - enter negative number")
    var n = 0
    do {
        n = readln().toInt();
        println(n);
    } while (n > 0)
}
