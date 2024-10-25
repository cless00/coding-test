package baekjoon.a6;

import java.util.Scanner;

public class B10988 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.println("0");
                return;
            }
        }
        System.out.println("1");
    }
}
