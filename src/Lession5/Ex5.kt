package Lession5

fun main() {
    val array_a = intArrayOf(2, 6, 9, -2)
    var array_b = intArrayOf(6, -2)
    var array_c = intArrayOf()

    print("Initial state, Array A: ")
    printArray(array_a)
    swapFirstLast(array_a)
    print("After processing, Array A: ")
    printArray(array_a)
    println()
    print("Initial state, Array B: ")
    printArray(array_b)
    swapFirstLast(array_b)
    print("After processing, Array B: ")
    printArray(array_b)
    println()
    print("Initial state, Array C: ")
    printArray(array_c)
    swapFirstLast(array_c)
    print("After processing, Array C: ")
    printArray(array_c)
    println()
}

fun swapFirstLast (arr: IntArray) {
    if (arr.size > 1) {
        val temp = arr[0]
        arr[0] = arr[arr.size - 1]
        arr[arr.size - 1] = temp
    }
}

fun printArray (arr: IntArray) {
    for (i in arr) {
        print("$i ")
    }
    println()
}