package self.divisor;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        // 제곱근으로 약수 구하기
        int n = 100;
        Set<Integer> divisors = new HashSet<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                divisors.add(n / i);
            }
        }
        System.out.println(divisors.size());
    }
}
