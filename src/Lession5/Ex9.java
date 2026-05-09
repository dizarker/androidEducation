package Lession5;

public class Ex9 {
    static void main() {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1, 0};

        if (checkForPalindrome(array)) {
            System.out.println("Array is a palindrone");
        } else {
            System.out.println("Array is not a palindrome");
        }
    }

    static boolean checkForPalindrome (int[] arr) {
        for (int k = 0; k < arr.length / 2; k++) {
            if (arr[k] != arr[arr.length - 1 - k]) {
                return false;
            }
        }
        return true;
    }
}
