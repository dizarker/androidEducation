package Lession4

fun main() {
    // Remove first input with number of matches. Use string length for this.
    val pool = readln()
    var d = 0
    var a = 0

    for (k in 0..<pool.length) {
        if (pool.get(k) == 'A') {
            a++
        } else {
            d++
        }
    }

    if (d > a) {
        println("Danik")
    } else if (d < a) {
        println("Anton")
    } else {
        println("Friendship")
    }
}
