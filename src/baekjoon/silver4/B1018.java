package baekjoon.silver4;

import java.util.Scanner;

public class B1018 {

    public static final int WIDTH_HEIGHT = 8;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // black = true;
        boolean[][] board = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            char[] line = sc.next().toCharArray();
            for (int j = 0; j < m; j++) {
                board[i][j] = (line[j] == 'B');
            }
        }


        int min = WIDTH_HEIGHT * WIDTH_HEIGHT;
        for (int i = 0; i <= n - WIDTH_HEIGHT; i++) {
            for (int j = 0; j <= m - WIDTH_HEIGHT; j++) {
                min = Math.min(min, calculate(board, i, j));
            }
        }

        System.out.println(min);
    }

    private static int calculate(boolean[][] board, int x, int y) {
        int countB = 0;
        int countW = 0;
        for (int i = x; i < x + WIDTH_HEIGHT; i++) {
            for (int j = y; j < y + WIDTH_HEIGHT; j++) {
                if ((i + j) % 2 == 0) {
                    if (board[i][j]) {
                        countW++;
                    }
                    if (!board[i][j]) {
                        countB++;
                    }
                } else {
                    if (board[i][j]) {
                        countB++;
                    }
                    if (!board[i][j]) {
                        countW++;
                    }
                }
            }
        }
        return Math.min(countB, countW);
    }
}
