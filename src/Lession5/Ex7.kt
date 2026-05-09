package Lession5

fun main() {
    val array = intArrayOf(1, 4, 2, 0, 3, 6, 3, 0, 0, 3, 7, 4, 7)

    print("Array, initial state: ")
    printArray(array)
    moveZerosToEnd(array)
    print("After processing: ")
    printArray(array)
}

fun moveZerosToEnd(arr: IntArray) {
    var zeros = 0
    var k = 0

    while (k < arr.size - zeros) {
        if (arr[k] == 0) {
            for (i in k until arr.size - 1) {
                arr[i] = arr[i + 1]
            }
            arr[arr.size - 1] = 0
            zeros++
            k-- // Suddenly the next element was also zero
        }
        k++
    }
}
