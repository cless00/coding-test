package baekjoon.b2;

import java.util.Scanner;

public class B2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (sum(i) == n) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(0);
    }

    public static int sum(int n) {
        char[] nChars = Integer.toString(n).toCharArray();
        int sum = n;
        for (char a : nChars) {
            sum += Integer.parseInt(a + "");
        }
        return sum;
    }
}
