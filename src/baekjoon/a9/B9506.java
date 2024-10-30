package baekjoon.a9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                return;
            }

            List<Integer> factors = getFactors(n);

            int sum = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < factors.size() - 1; i++) {
                sum += factors.get(i);
                sb.append(factors.get(i));
                if (i < factors.size() - 2) {
                    sb.append(" + ");
                }
            }

            if (sum == n) {
                System.out.println(n + " = " + sb);
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }

    private static List<Integer> getFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }
}
