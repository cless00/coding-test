package baekjoon.a7;

import java.util.Scanner;

public class B2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -1;
        int n = 0;
        int m = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int value = sc.nextInt();
                if (value > max) {
                    max = value;
                    n = i;
                    m = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(n + " " + m);
    }
}
