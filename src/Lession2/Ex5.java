package Lession2;

import java.util.Scanner;

public class Ex5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number, for end enter negative number");
        int n;
        do {
            n = sc.nextInt();
            System.out.println(n);
        } while (n > 0);
    }
}
