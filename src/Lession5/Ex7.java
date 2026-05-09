package Lession5;

public class Ex7 {

    static void main() {
        int[] array = new int[]{1, 4, 2, 0, 3, 6, 3, 0, 0, 3, 7, 4, 7};
        System.out.print("Array, initial state: ");
        printArray(array);
        moveZerosToEnd(array);
        System.out.print("After processing: ");
        printArray(array);
    }

    static void moveZerosToEnd (int[] arr) {
        int zeros = 0;
        for (int k = 0; k < arr.length - zeros; k++) {
            if (arr[k] == 0) {
                for (int i = k; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = 0;
                zeros++;
                k--;                // Suddenly the next element was also zero
            }
        }
    }

    static void printArray (int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

}
