package Lession4;

import java.util.Scanner;

public class Ex1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        System.out.println(capitalize(str));
    }

    static String capitalize (String inputString ) {
        char first = inputString.charAt(0);

        if (first > 'Z') {
            first -= 'a' - 'A';
        }

        return first + inputString.substring(1);
    }
}
