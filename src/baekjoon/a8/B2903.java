package baekjoon.a8;

import java.util.Scanner;

public class B2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int row = 2;
        for (int i = 0; i < n; i++) {
            row += (row - 1);
        }
        System.out.println(row * row);

        sc.close();
    }
}
