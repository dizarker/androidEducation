package Lession2

fun main() {
    print("Enter length of side A: ")
    val a = readln().toInt()
    print("Enter length of side B: ")
    val b = readln().toInt()
    val p = 2 * (a + b)
    val area = a * b

    println("Perimeter is: ${p}")
    println("Area is: ${area}")
}
