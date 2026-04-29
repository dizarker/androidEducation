package Lession2;

import java.util.Scanner;

public class Ex4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();

        int summ = 0;
        int j = 1;
        while (j <= n) {
            summ += j;
            j++;
        }

        System.out.println("Summ of number from 1 to " + n + ": " + summ);
    }
}
