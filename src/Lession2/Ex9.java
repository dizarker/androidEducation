package Lession2;

import java.util.Scanner;

public class Ex9 {

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N of Fibbonacci seq: ");
        int N = sc.nextInt();
        System.out.println(fibbonacci(N));
    }

    private static int fibbonacci (int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibbonacci(n - 1) + fibbonacci(n - 2);
        }
    }
}
