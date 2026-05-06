package Lession4

const val MAXLENGTH = 10

fun main() {
    val n = readln().toInt()

    for (i in 0 until n) {
        val str = readln()
        println(reduce(str))
    }
}

fun reduce (inputString: String): String {
    if (inputString.length <= MAXLENGTH) {
        return inputString
    }

    val sb = StringBuilder()
    sb.append(inputString[0])
    sb.append(inputString.length - 2)
    sb.append(inputString[inputString.length - 1])

    return sb.toString()
}
