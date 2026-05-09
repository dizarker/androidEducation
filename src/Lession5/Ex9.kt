package Lession5

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 6, 4, 3, 2, 1)

    if (checkForPalindrome(array)) {
        println("Array is a palindrome")
    } else {
        println("Array is not a palindrome")
    }
}

fun checkForPalindrome (arr: IntArray) : Boolean {
    for (i in 0 until arr.size / 2) {
        if (arr[i] != arr[arr.size - 1 - i])  {
            return false
        }
    }
    return true
}