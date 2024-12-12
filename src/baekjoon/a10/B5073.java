package baekjoon.a10;

import java.util.Scanner;

public class B5073 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                return;
            }

            int longer = Math.max(a, Math.max(b, c));
            if (longer >= (a + b + c - longer)) {
                System.out.println("Invalid");
            } else if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
