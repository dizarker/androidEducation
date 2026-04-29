package Lession2

fun main() {
    print("Enter a number: ")
    val num = readln().toInt();

    var summ = 0;
    var i = 1;
    while (i <= num) {
        summ += i
        i++
    }
    println(summ)
}
