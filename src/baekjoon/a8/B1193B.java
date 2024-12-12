package baekjoon.a8;

import java.util.Scanner;

public class B1193B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        long sum = 0;
        boolean forward = true;
        for (long i = 1; ; i++) {
            if (sum + i >= n) {
                long x, y;
                if (forward) {
                    x = i - (n - sum) + 1;
                    y = (n - sum);
                } else {
                    x = (n - sum);
                    y = i - (n - sum) + 1;
                }
                System.out.println(x + "/" + y);
                return;
            }
            sum += i;
            forward = !forward;
        }
    }
}
