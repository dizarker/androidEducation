package Lession2;

import java.util.Scanner;

public class Ex7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of scores: ");
        int score = sc.nextInt();

        if (score > 100) {
            System.out.println("It's impossible!");
        } else if (score >= 90) {
            System.out.println("Your grade is A");
        } else if (score >= 75) {
            System.out.println("Your grade is B");
        } else if (score >= 50) {
            System.out.println("Your grade is C");
        } else if (score >= 30) {
            System.out.println("Your grade is D");
        } else if (score >= 0) {
            System.out.println("Your grade is F");
        } else {
            System.out.println("You are out of grades");
        }
    }
}
