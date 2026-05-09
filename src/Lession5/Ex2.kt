package Lession5

fun main() {
    val array = intArrayOf(-7, 14, -3, 18, -12, 5, -18, 2, 11, -8, 0, 17, -4, 9, -15, 6, 0, 13, -10, 4)

    var num_even = 0;
    var num_odd = 0;

    for (i in array) {
        if (i % 2 == 0) {
            num_even++
        } else {
            num_odd++
        }
    }

    println("Count of even numbers: $num_even")
    println("Count of odd numbers: $num_odd")
}
