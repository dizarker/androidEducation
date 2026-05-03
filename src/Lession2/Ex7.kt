package Lession2

fun main() {
    print("Enter the number of scores: ")
    val score = readln().toInt()

    if (score > 100) {
        println("It's impossible!")
    } else if (score >= 90) {
        println("Your grade is A")
    } else if (score >= 75) {
        println("Your grade is B")
    } else if (score >= 50) {
        println("Your grade is C")
    } else if (score >= 30) {
        println("Your grade is D")
    } else if (score >= 0) {
        println("Your grade is F")
    } else {
        println("You are out of grades")
    }
}