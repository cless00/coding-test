package baekjoon.a6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class B1157 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] charArray = s.nextLine().toUpperCase().toCharArray();

        Map<String, Integer> map = new HashMap<>();

        for (char c : charArray) {
            String cs = String.valueOf(c);
            int count = map.getOrDefault(cs, 0);
            map.put(cs, count + 1);
        }

        List<String> sorted = map.keySet().stream()
                .sorted(((o1, o2) -> map.get(o2).compareTo(map.get(o1))))
                .collect(Collectors.toList());

        int maxCount = map.get(sorted.get(0));

        StringBuilder result = new StringBuilder();
        for (String c : sorted) {
            if (map.get(c) == maxCount) {
                result.append(c);
            }
        }

        System.out.println(result.length() > 1 ? "?" : result.toString());
    }
}
