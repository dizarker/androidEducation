package Lession2;

import java.util.Scanner;

public class Ex8 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        for (int i = 0; i <= N; i++) {
            System.out.println(N + " * " + (i + 1) + " = " + (N * (i + 1)));
        }
    }
}
