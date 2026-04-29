package Lession2;

import java.util.Scanner;

public class Ex3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();

        for (int k = 1; k <= n; k++) {
            System.out.println(k);
        }
    }
}
