package baekjoon.a10;

import java.util.Scanner;

public class B14215 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int longer = Math.max(a, Math.max(b, c));
        int subSum = a + b + c - longer;
        if (longer >= subSum) {
            System.out.println(subSum * 2 - 1);
        } else {
            System.out.println(a + b + c);
        }
    }
}
