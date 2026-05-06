package Lession4;

import java.util.Scanner;

public class Ex4 {

    static private final int MAXLENGTH = 10;

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int k = 0; k < n; k++) {
            String str = sc.next();
            System.out.println(reduce(str));
        }
    }

    static String reduce (String inputString) {
        if (inputString.length() <= MAXLENGTH) {
            return inputString;
        }

        StringBuilder sc = new StringBuilder();
        sc.append(inputString.charAt(0));
        sc.append(inputString.length()-2);
        sc.append(inputString.charAt(inputString.length() - 1));
        return sc.toString();
    }
}
