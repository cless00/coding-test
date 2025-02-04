package baekjoon.silver5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1181
public class B1181 {
    // selection sort
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = sc.next();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int pos = i;
                if (compare(strings[i], strings[j]) > 0) {
                    pos = j;
                }
                String temp = strings[i];
                strings[i] = strings[pos];
                strings[pos] = temp;
            }
        }
        String prev = "";
        for (int i = 0; i < n; i++) {
            if (prev.equals(strings[i])) {
                continue;
            }
            prev = strings[i];
            System.out.println(strings[i]);
        }

    }

    public static int compare(String a, String b) {
        if (a.length() != b.length()) {
            return a.length() - b.length();
        } else {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    return a.charAt(i) - b.charAt(i);
                }
            }
        }
        return 0;
    }

    // list + sort
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> strs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            strs.add(sc.next());
        }

        strs.sort((o1, o2) -> {
            if (o1.length() == o2.length()) {
                for (int i = 0; i < o1.length(); i++) {
                    if (o1.charAt(i) != o2.charAt(i)) {
                        return o1.charAt(i) - o2.charAt(i);
                    }
                }
            } else {
                return o1.length() - o2.length();
            }
            return 0;
        });
        strs.stream().distinct().forEach(System.out::println);
    }
}

