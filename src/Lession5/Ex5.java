package Lession5;

public class Ex5 {
    static void main() {
        int[] array_a = new int[] {0, 5, 3, 44, 2};
        int[] array_b = new int[] {3};
        int[] array_c = new int[] {};

        System.out.print("Initial state, Array A: ");
        printArray(array_a);
        swapFirstLast(array_a);
        System.out.print("After processing, Array A: ");
        printArray(array_a);
        System.out.println();
        System.out.print("Initial state, Array B: ");
        printArray(array_b);
        swapFirstLast(array_b);
        System.out.print("After processing, Array B: ");
        printArray(array_b);
        System.out.println();
        System.out.print("Initial state, Array C: ");
        printArray(array_c);
        swapFirstLast(array_c);
        System.out.print("After processing, Array C: ");
        printArray(array_c);
        System.out.println();
    }

    static void swapFirstLast (int[] array) {
        if (array.length > 1) {
            int tmp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = tmp;
        }
    }

    static void printArray (int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
}
