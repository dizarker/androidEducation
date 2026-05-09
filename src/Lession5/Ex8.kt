package Lession5

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    print("Array, initial state: ")
    printArray(array)
    reverseArray(array)
    print("After processing: ")
    printArray(array)
}

fun reverseArray(array: IntArray) {
    for (i in 0 until array.size / 2) {
        val temp = array[i]
        array[i] = array[array.size - i - 1]
        array[array.size - i - 1] = temp
    }
}
