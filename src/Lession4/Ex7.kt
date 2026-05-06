package Lession4

fun main() {
    val n = readln().toInt()

    for (k in 0..<n) {
        val cityName = readln();
        println(rename(cityName))
    }
}

fun rename(name: String): String {
    val sb = StringBuilder()

    val triplet = name.split(' ')
    sb.append(triplet[0][0])
    sb.append(triplet[1][0])
    sb.append(triplet[2][0])

    return sb.toString()
}
