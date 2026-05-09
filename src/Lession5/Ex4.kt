package Lession5

fun main() {
    val array_a = intArrayOf(7, 14, 3, 19, 8, 12, 5, 17, 2, 11, 9, 16, 4, 20, 6, 13, 1, 18, 10, 15)
    val array_b = intArrayOf(-7, 14, 3, 19, 8, 12, 5, 17, 2, 11, 9, 16, 4, 20, 6, 13, 1, 18, 10, 15)

    println("Array A contains only positive numbers: ${checkForPositive(array_a)}")
    println("Array B contains only positive numbers: ${checkForPositive(array_b)}")
}

fun checkForPositive(arr: IntArray): Boolean {
    for (a in arr) {
        if (a < 0) {
            return false
        }
    }
    return true
}
