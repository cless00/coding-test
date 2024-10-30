package baekjoon.a9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = sc.nextInt();

        List<Integer> factors = getFactors(n);

        if (factors.size() < idx) {
            System.out.println(0);
        } else {
            System.out.println(factors.get(idx - 1));
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
