package Lession4

fun main() {
    val forward = readln();
    val backward = readln();

    if (checkReverse(forward, backward)) {
        println("YES")
    } else {
        println("NO")
    }
}

fun checkReverse (strA: String, strB: String): Boolean {
    if (strA.length != strB.length) {
        return false
    }

    var res = true;
    for (i in 0 until strA.length) {
        if (strA[i] != strB[strA.length - i - 1]) {
            res = false
            break;
        }
    }

    return res
}
