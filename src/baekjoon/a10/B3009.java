package baekjoon.a10;

import java.util.Scanner;

public class B3009 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        int x2 = s.nextInt();
        int y2 = s.nextInt();
        int x3 = s.nextInt();
        int y3 = s.nextInt();

        int x = ((Math.min(x1, Math.min(x2, x3)) + Math.max(x1, Math.max(x2, x3))) * 2) - (x1 + x2 + x3);
        int y = ((Math.min(y1, Math.min(y2, y3)) + Math.max(y1, Math.max(y2, y3))) * 2) - (y1 + y2 + y3);

        System.out.println(x + " " + y);
    }
}
