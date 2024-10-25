package baekjoon.a1;

import java.util.Scanner;

public class B2588 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int b1 = b % 10;
        int b10 = (b % 100) / 10;
        int b100 = (b % 1000) / 100;

        System.out.println(a * b1);
        System.out.println(a * b10);
        System.out.println(a * b100);
        System.out.println(a * b);
    }
}
