package Lession5;

public class Ex3 {
    static void main() {
        int[] array = new int[] {7, 2, 9, 4, 0, 6, 3, 8, 1, 5, 3, 2, 7, 4, 9, 1, 0, 6, 3, 8};

        int max = array[0];
        int max_first_index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                max_first_index = i;
            }
        }

        System.out.println("First max at index: " + max_first_index);
    }
}
