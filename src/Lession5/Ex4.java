package Lession5;

public class Ex4 {
    static void main() {
        int[] array_a = new int[] {3, 5, 7, 2, 8, 4, 6, 9, 1, 10};
        int[] array_b = new int[] {3, 5, 7, 2, -8, 4, 6, 9, 1, 10};

        System.out.println("Array A contains only positive numbers: " + checkForNegative(array_a));
        System.out.println("Array B contains only positive numbers: " + checkForNegative(array_b));
    }

    static boolean checkForNegative (int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] < 0) return false;
        }
        return true;
    }

}
