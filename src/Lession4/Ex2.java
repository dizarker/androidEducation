package Lession4;

import java.util.Scanner;

public class Ex2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(reverseWords(str));
    }

    static String reverseWords (String inputString) {
        StringBuilder sb = new StringBuilder();
        int end = inputString.length() - 1;
        for (;;) {
            int start = inputString.lastIndexOf(' ', end);
            for (int k = start + 1; k <= end; k++) {
                sb.append(inputString.charAt(k));
            }
            if (start < 0) {
                break;
            }
            sb.append(' ');
            end = start - 1;
        }
        return sb.toString();
    }
}
