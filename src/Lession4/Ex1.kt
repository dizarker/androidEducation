package Lession4

fun main() {
    print("Enter a string: ");
    val str = readln();
    print(capitalize(str))
}

fun capitalize (inputString: String): String {
    var first = inputString[0];
    if (first > 'Z') {
        first -= 'a' - 'A'
    }
    return first + inputString.substring(1);
}