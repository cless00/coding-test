package baekjoon.a8;

import java.util.Scanner;

public class B2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        if (n == 1) {
            System.out.println("1");
            return;
        }

        long cal = 1;
        for (long i = 2; ; i++) {
            cal += i * 6 - 6;
            if (cal >= n) {
                System.out.println(i);
                return;
            }
        }
    }
}
