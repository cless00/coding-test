package baekjoon.a6;

import java.util.Scanner;

public class B3003 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        final int[] std = {1,1,2,2,2,8};
        int[] current = new int[6];

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < std.length; i++) {
            current[i] = s.nextInt();
            sb.append(std[i] - current[i]);
            sb.append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
