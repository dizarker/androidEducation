package Lession5

fun main() {
    val array_a = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val array_b = intArrayOf(1, 2, 2, 4, 5, 6, 7, 8, 9, 10)

    if (compareArrays(array_a, array_b)) {
        println("Arrays are identical")
    } else {
        println("Arrays are different")
    }
}

fun compareArrays(array1: IntArray, array2: IntArray): Boolean {
    var res = true;

    if (array1.size == array2.size) {
        for (i in 0 until array1.size - 1) {
            if (array1[i] != array2[i]) {
                res = false
                break
            }
        }
    } else {
        res = false
    }

    return res
}