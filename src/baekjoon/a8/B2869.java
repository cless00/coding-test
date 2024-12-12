package baekjoon.a8;

import java.util.Scanner;

public class B2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long v = sc.nextLong();

        long daily = a - b;
        long min = v - a;
        int days = (int) Math.ceil((double) min / daily) + 1;
        System.out.println(days);
    }
}
