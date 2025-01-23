package baekjoon.bronze2;

import java.math.BigInteger;
import java.util.Scanner;

// https://www.acmicpc.net/problem/15829
public class B15829 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] chars = sc.next().toCharArray();
        int r = 31;
        int m = 1234567891;
        BigInteger sum = BigInteger.valueOf(0);
        for (int i = 0; i < chars.length; i++) {
            sum = sum.add(sqrt(r, i)
                            .multiply(BigInteger.valueOf(chars[i] - 'a' + 1)))
                    .mod(BigInteger.valueOf(m));
        }

        System.out.println(sum.mod(BigInteger.valueOf(m)));
    }

    public static BigInteger sqrt(int r, int i) {
        BigInteger multi = BigInteger.valueOf(1);
        for (int j = 0; j < i; j++) {
            multi = multi.multiply(BigInteger.valueOf(r));
        }
        return multi;
    }
}