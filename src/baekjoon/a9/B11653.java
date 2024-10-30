package baekjoon.a9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int remaining = n;

        while (remaining != 1) {
            int minFactor = getMinPrimeFactor(remaining);
            remaining /= minFactor;
            list.add(minFactor);
        }

        for (Integer i : list) {
            System.out.println(i);
        }
    }

    private static int getMinPrimeFactor(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                return i;
            }
        }
        return n;
    }

    private static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (count > 2) {
                    return false;
                }
            }
        }
        return true;
    }
}
