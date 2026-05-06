package Lession4;

import java.util.Scanner;

public class Ex5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String strA = sc.next();
        String strB = sc.next();

        System.out.println(check(strA, strB));
    }

    static int check (String a, String b) {
        int ckA = 0;
        int ckB = 0;

        String _a = a.toLowerCase();
        String _b = b.toLowerCase();

        for (int k = 0; k < a.length(); k++) {
            ckA += _a.charAt(k);
            ckB += _b.charAt(k);
        }

        if (ckA == ckB) {
            return 0;
        } else if (ckA < ckB) {
            return -1;
        } else {
            return 1;
        }
    }
}
