package baekjoon.a9;

import java.util.Scanner;

public class B5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                return;
            }

            if (isFactor(a, b)) {
                System.out.println("factor");
            } else if (isMultiple(a, b)) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
    }

    private static boolean isFactor(int a, int b) {
        if (a == 0) {
            return false;
        }
        return (b % a) == 0;
    }

    private static boolean isMultiple(int a, int b) {
        if (b == 0) {
            return false;
        }
        return (a % b) == 0;
    }
}
