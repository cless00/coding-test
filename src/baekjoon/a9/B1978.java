package baekjoon.a9;

import java.util.Scanner;

public class B1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (isPrime(a)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isPrime(int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
}
