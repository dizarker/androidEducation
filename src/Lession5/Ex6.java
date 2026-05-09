package Lession5;

public class Ex6 {
    static void main() {
        int[] array_a = new int[] {1, 2, 3, 4, 5, 6, 7};
        int[] array_b = new int[] {1, 2, 3, 4, 5, 6};

        if (compareArrays(array_a, array_b)) {
            System.out.println("Arrays are identical");
        } else {
            System.out.println("Arrays are different");
        }
    }

    static boolean compareArrays (int[] arr_a, int[] arr_b) {
        boolean res = true;
        if (arr_a.length == arr_b.length) {
            for (int k = 0; k < arr_a.length; k++) {
                if (arr_a[k] != arr_b[k]) {
                    res = false;
                    break;
                }
            }
        } else {
            res = false;
        }

        return res;
    }
}
