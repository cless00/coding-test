package baekjoon.a10;

import java.util.Scanner;

public class B9063 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long xMin = 99999;
        long xMax = -99999;
        long yMin = 99999;
        long yMax = -99999;
        for (int i = 0; i < n; i++) {
            long x = s.nextInt();
            long y = s.nextInt();
            if (xMin > x) {
                xMin = x;
            }
            if (xMax < x) {
                xMax = x;
            }
            if (yMin > y) {
                yMin = y;
            }
            if (yMax < y) {
                yMax = y;
            }
        }
        System.out.println((xMax - xMin) * (yMax - yMin));
    }
}
