package Lession5;

public class Ex8 {
    static void main() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.print("Array, initial state: ");
        printArray(array);
        reverseArray(array);
        System.out.print("After processing: ");
        printArray(array);

    }

    static void reverseArray (int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
    }

    static void printArray (int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
}
