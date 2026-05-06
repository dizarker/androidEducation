package Lession4;

import java.util.Scanner;

public class Ex7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // WTF? What the garbage in buffer?
        sc.nextLine();

        for (int k = 0; k < n; k++) {
            String cityName = sc.nextLine();
            System.out.println(rename(cityName));
        }
    }

    static String rename (String name) {
        StringBuilder sb = new StringBuilder();

        String[] triplet = name.split(" ");
        sb.append(triplet[0].charAt(0));
        sb.append(triplet[1].charAt(0));
        sb.append(triplet[2].charAt(0));

        return sb.toString();
    }
}
