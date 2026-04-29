package Lession2;

import java.util.Scanner;

public class Ex6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of side A: ");
        int a = sc.nextInt();
        System.out.print("Enter length of side B: ");
        int b = sc.nextInt();

        int p = 2 * (a + b);
        int sq = a * b;

        System.out.println("Perimeter: " + p);
        System.out.println("Area: " + sq);
    }
}
