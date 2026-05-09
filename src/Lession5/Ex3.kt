package Lession5

fun main() {
    val array = intArrayOf(3, 7, 1, 9, 4, 0, 8, 2, 5, 6, 5, 3, 1, 7, 4, 9, 2, 0, 6, 8)

    var first_max_index = 0
    var max = array[0]

    for (i in 1 until array.size) {
        if (array[i] > max) {
            max = array[i];
            first_max_index = i
        }
    }

    println("First max at index: $first_max_index")
}
