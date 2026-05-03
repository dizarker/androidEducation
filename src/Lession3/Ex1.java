package Lession3;

import java.util.Scanner;

public class Ex1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        int[] digits = NumberSplit.split(number);
        System.out.print("Number " + number);
        if (checkForPalindrome(digits)) {
            System.out.println(" is a palindrome");
        } else {
            System.out.println(" is not a palindrome");
        }
    }

    private static boolean checkForPalindrome (int[] array) {
        int size = array.length;
        boolean res = true;

        for (int k = 0; k < size / 2; k++) {
            if (array[k] != array[size - k - 1]) {
                res = false;
                break;
            }
        }

        return res;
    }
}
