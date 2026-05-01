package Lession3;

import java.util.Scanner;

public class Ex4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a height of strait: ");
        int height = sc.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print('#');
            }
            System.out.println();
        }
    }
}
