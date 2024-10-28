package baekjoon.a6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B1316 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (isGroupWord(s.nextLine())) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isGroupWord(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char key = charArray[i];
            Integer idx = map.get(key);
            if (idx == null) {
                map.put(key, i);
            } else if (idx == i - 1) {
                map.put(key, i);
            } else {
                return false;
            }
        }
        return true;
    }
}
