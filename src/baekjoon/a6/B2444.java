package baekjoon.a6;

import java.util.Scanner;

import static java.lang.Math.abs;

public class B2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineCount = sc.nextInt();

        for (int i = 1 - lineCount; i <= lineCount - 1; i++) {
            for (int j = 0; j < abs(i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (lineCount - abs(i)) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        for (int i = 1; i <= lineCount; i++) {
//            for (int j = 0; j < lineCount - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i * 2 - 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = lineCount - 1; i > 0; i--) {
//            for (int j = 0; j < lineCount - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i * 2 - 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
