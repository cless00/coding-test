package baekjoon.a7;

import java.util.Scanner;

public class B2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = getMatrix(n, m, sc);
        int[][] b = getMatrix(n, m, sc);
        int[][] sum = new int[n][m];

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < m; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                sb.append(sum[i][j]);
                sb.append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }

    private static int[][] getMatrix(int n, int m, Scanner sc) {
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }
}
