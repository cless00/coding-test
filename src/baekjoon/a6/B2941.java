package baekjoon.a6;

import java.util.List;
import java.util.Scanner;

public class B2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        List<String> list = List.of("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=");

        for (String s : list) {
            str = str.replace(s, "*");
        }

        System.out.println(str.length());

//        char[] chars = sc.nextLine().toCharArray();
//
//        int charCount = 0;
//        int cur = 0;
//
//        while (cur < chars.length) {
//            char first = chars[cur];
//            if (first == 'c') {
//                if (cur + 1 < chars.length && (chars[cur + 1] == '=' || chars[cur + 1] == '-')) {
//                    charCount++;
//                    cur += 2;
//                } else {
//                    charCount++;
//                    cur++;
//                }
//            } else if (first == 'd') {
//                if (cur + 1 < chars.length && chars[cur + 1] == '-') {
//                    charCount++;
//                    cur += 2;
//                } else if (cur + 1 < chars.length && chars[cur + 1] == 'z' &&
//                        cur + 2 < chars.length && chars[cur + 2] == '=') {
//                    charCount++;
//                    cur += 3;
//                } else {
//                    charCount++;
//                    cur++;
//                }
//            } else if (first == 'l') {
//                if (cur + 1 < chars.length && chars[cur + 1] == 'j') {
//                    charCount++;
//                    cur += 2;
//                } else {
//                    charCount++;
//                    cur++;
//                }
//            } else if (first == 'n') {
//                if (cur + 1 < chars.length && chars[cur + 1] == 'j') {
//                    charCount++;
//                    cur += 2;
//                } else {
//                    charCount++;
//                    cur++;
//                }
//            } else if (first == 's') {
//                if (cur + 1 < chars.length && chars[cur + 1] == '=') {
//                    charCount++;
//                    cur += 2;
//                } else {
//                    charCount++;
//                    cur++;
//                }
//            } else if (first == 'z') {
//                if (cur + 1 < chars.length && chars[cur + 1] == '=') {
//                    charCount++;
//                    cur += 2;
//                } else {
//                    charCount++;
//                    cur++;
//                }
//            } else {
//                charCount++;
//                cur++;
//            }
//        }
//        System.out.println(charCount);
    }
}
