package baekjoon.silver4;

import java.util.Scanner;

public class B2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max3kgBags = n / 3;
        int max5kgBags = n / 5;

        for (int bag5 = max5kgBags; bag5 >= 0; bag5--) {
            for (int bag3 = 0; bag3 <= max3kgBags; bag3++) {
                if ((bag5 * 5.0 + bag3 * 3.0) == n) {
                    System.out.println(bag5 + bag3);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
