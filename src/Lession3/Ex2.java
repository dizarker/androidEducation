package Lession3;

import java.util.Scanner;

public class Ex2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Number " + num);
        if (checkForPrime(num)) {
            System.out.println(" is a prime number");
        } else {
            System.out.println(" is not a prime number");
        }
    }

    private static boolean checkForPrime (int n) {
        for (int k = 2; k <= Math.sqrt(n); k++) {
            if (n % k == 0) {
                return false;
            }
        }
        return  true;
    }
}
