package Lession5;

public class Ex1 {
    static void main() {
        int[] Array = new int[] {3, -7, 0, 9, -2, -10, 6, 1, -5, 8, -3, 4, -9, 2, 7, -1, 10, -6, 5, 0};

        int min_index = 0;
        int max_index = 0;
        int min = Array[0];
        int max = Array[0];

        for (int i = 1; i < Array.length; i++) {
            if (Array[i] > max) {
                max = Array[i];
                max_index = i;
            } else if (Array[i] < min) {
                min = Array[i];
                min_index = i;
            }
        }

        System.out.println("Min: " + min + " at index " + min_index);
        System.out.println("Max: " + max + " at index " + max_index);
    }
}
