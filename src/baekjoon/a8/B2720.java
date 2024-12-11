package baekjoon.a8;

import java.util.Scanner;

public class B2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.nextLine());
            System.out.print((num / 25) + " ");
            num = num % 25;
            System.out.print((num / 10) + " ");
            num = num % 10;
            System.out.print((num / 5) + " ");
            System.out.println(num % 5);
        }
        sc.close();
    }
}
