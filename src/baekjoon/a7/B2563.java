package baekjoon.a7;

import java.util.Scanner;

public class B2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] paper = new int[100][100];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            paint(paper, x, y);
        }

        int result = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                result += paper[i][j];
            }
        }
        System.out.println(result);
    }

    private static void paint(int[][] paper, int x, int y) {
        for (int i = x; i < x + 10; i++) {
            for (int j = y; j < y + 10; j++) {
                paper[i][j] = 1;
            }
        }
    }
}
