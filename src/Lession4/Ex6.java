package Lession4;

import java.util.Scanner;

public class Ex6 {
    static void main() {
        // Remove first input with number of matches. Use string length for this.
        Scanner sc = new Scanner(System.in);
        String pool = sc.next();

        int d = 0;
        int a = 0;

        for (int k = 0; k < pool.length(); k++) {
            if (pool.charAt(k) == 'A') {
                a++;
            } else {
                d++;
            }
        }

        if (d > a) {
            System.out.println("Danik");
        } else if (d < a) {
            System.out.println("Anton");
        } else {
            System.out.println("Friendship");
        }
    }
}
