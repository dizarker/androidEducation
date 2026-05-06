package Lession4

fun main() {
    print("Enter a string: ")
    val string = readln()
    print(reverseWords(string))

}

fun reverseWords(inputString: String): String {
    val sb = StringBuilder()
    var end = inputString.length - 1
    while(true) {
        val start = inputString.lastIndexOf(' ', end)
        for (k in start + 1 .. end) {
            sb.append(inputString[k])
        }
        if (start < 0) {
            break;
        }
        sb.append(' ')
        end = start - 1
    }
    return sb.toString()
}
