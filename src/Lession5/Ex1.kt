package Lession5

fun main() {
    val array = intArrayOf(-29, 14, -4, 0, 17, -16, 3, -11, 8, -2, 19, -7, 5, -20, 12, -3, 6, -14, 1, 10)

    var max = array[0];
    var min = array[0];
    var max_index = 0;
    var min_index = 0;

    for (i in 1 until array.size) {
        if (array[i] > max) {
            max = array[i];
            max_index = i;
        } else if (array[i] < min) {
            min = array[i];
            min_index = i;
        }
    }

    println("Max: $max at index $max_index")
    println("Min: $min at index $min_index")
}
