package Lession4;

import java.util.Scanner;

public class Ex3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String forward = sc.next();
        String backward = sc.next();

        if (checkReverse(forward, backward)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean checkReverse (String strA, String strB) {
        // Check lengths
        if (strA.length() != strB.length()) {
            return false;
        }

        // Check reverse
        boolean res = true;
        for (int k = 0; k < strA.length(); k++) {
            if (strA.charAt(k) != strB.charAt(strA.length() - k - 1)) {
                res = false;
                break;
            }
        }

        return res;
    }
}

