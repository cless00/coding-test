package baekjoon.a8;

import java.util.Scanner;

public class B2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();
        int numCode = sc.nextInt();

        int decimal = 0;
        int digitNum = 1;
        for (int i = num.length() - 1; i >= 0; i--) {
            int val = 0;
            if (num.charAt(i) >= 'A') {
                val = num.charAt(i) - 'A' + 10;
            } else {
                val = num.charAt(i) - '0';
            }
            decimal += val * digitNum;
            digitNum *= numCode;
        }

        System.out.println(decimal);

        sc.close();
    }
}
