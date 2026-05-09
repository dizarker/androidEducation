package Lession5;

public class Ex2 {
    static void main() {
        int[] array = new int[] {-12, 7, -3, 15, -9, 4, -17, 2, 19, -6, 11, -14, 0, -5, -2, 16, -5, 13, -1, 10};

        int num_even = 0;
        int num_odd = 0;

        for (int k = 0; k < array.length; k++) {
            if (array[k] % 2 == 0) {
                num_even++;
            } else {
                num_odd++;
            }
        }

        System.out.println("Count of even numbers: " + num_even);
        System.out.println("Count of odd numbers: " + num_odd);
    }
}
