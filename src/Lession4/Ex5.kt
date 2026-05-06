package Lession4

fun main () {
    val strA = readln()
    val strB = readln()

    print(check(strA, strB))
}

fun check (a: String, b: String) : Int {
    val _a = a.lowercase()
    val _b = b.lowercase()

    var ckA = 0;
    var ckB = 0;

    for (i in 0 until _a.length) {
        ckA += _a[i].toInt()
        ckB += _b[i].toInt()
    }

    if (ckA == ckB) {
        return 0
    } else if (ckA < ckB) {
        return -1
    } else {
        return 1
    }
}