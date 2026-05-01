package Lession3;

import java.util.Scanner;

public class Ex3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        int hashSumm = hashMe(num);
        System.out.println("Hash summ of number " + num + " is " + hashSumm);
    }

    private static int hashMe (long number) {
        int[] arr = NumberSplit.split(number);
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }

        if (summ > 10) {
            summ = hashMe(summ);
        }
        return summ;
    }
}
