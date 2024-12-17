package leetcode.roman.to.integer;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt2(String s) {
        int sum = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int num = 0;
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if (num * 5 == prev || num * 10 == prev) {
                sum -= num;
            } else {
                sum += num;
            }
            prev = num;
        }
        return sum;
    }

    public int romanToInt(String s) {
        // I V X L C D M
        // I II III IV IX
        //
        // XL XC
        // CD CM

        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("II", 2);
        map.put("III", 3);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        String buf = "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            buf = buf + s.charAt(i);
            if (i + 1 == s.length()) {
                sum += map.get(buf);
            } else {
                if (buf.startsWith("I") && s.charAt(i + 1) == 'I' && buf.length() < 3) {
                    continue;
                } else if (buf.startsWith("I") &&
                        (s.charAt(i + 1) == 'I' || s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                    continue;
                } else if (buf.startsWith("X") &&
                        (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                    continue;
                } else if (buf.startsWith("C") &&
                        (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                    continue;
                }
                sum += map.get(buf);
                buf = "";
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String roman = "MCMXCIV";
        int answer = 1994;

        int result = solution.romanToInt(roman);
        System.out.println(result == answer ? "success" : "fail");
        System.out.println("roman=" + roman + ", correct answer=" + answer + ", result=" + result);

        int result2 = solution.romanToInt2(roman);
        System.out.println(result2 == answer ? "success" : "fail");
        System.out.println("roman=" + roman + ", correct answer=" + answer + ", result2=" + result2);
    }
}
