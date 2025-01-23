package baekjoon.bronze1;

import java.util.Scanner;

// https://www.acmicpc.net/problem/11050
// https://www.youtube.com/watch?v=M6tVz2g6Q3s
// https://ko.wikipedia.org/wiki/%EC%9D%B4%ED%95%AD_%EA%B3%84%EC%88%98
public class B11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        // n = 5, k = 2 => 10
        // 5C2 = 4C1 + 4C2
        // 4C1 = 3C0 + 3C1, 4C2 = 3C1 + 3C2
        // 3C1 = 2C0 + 2C1 ...

        System.out.println(binomial(n, k));

    }

    public static int binomial(int n, int k) {
        if (k == 0 || n == k) {
            return 1;
        } else if (k == 1) {
            return n;
        }
        int left = k - 1 >= 0 ? binomial(n - 1, k - 1) : 0;
        int right = k <= n - 1 ? binomial(n - 1, k) : 0;
        return left + right;
    }
}
