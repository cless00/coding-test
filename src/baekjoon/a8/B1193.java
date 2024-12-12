package baekjoon.a8;

import java.util.Scanner;

public class B1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("1/1");
            return;
        }
        int x = 1;
        int y = 1;
        int count = 2;
        boolean forward = true;
        int max = 2;
        while (true) {
            for (int i = 1; i <= max; i++) {
                if (i == 1) {
                    if (forward) {
                        y++;
                    } else {
                        x++;
                    }
                } else {
                    if (forward) {
                        x++;
                        y--;
                    } else {
                        x--;
                        y++;
                    }
                }

                if (n == count) {
                    System.out.println(x + "/" + y);
                    return;
                }

                count++;
            }
            max++;
            forward = !forward;
        }
    }
}
