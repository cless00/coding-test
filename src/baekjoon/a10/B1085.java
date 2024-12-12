package baekjoon.a10;

import java.util.Scanner;

public class B1085 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int w = s.nextInt();
        int h = s.nextInt();

        int left = x;
        int right = w - x;
        int top = h - y;
        int bottom = y;
        System.out.println(Math.min(left, Math.min(right, Math.min(top, bottom))));
    }
}
