package baekjoon.silver4;

import java.util.*;
import java.util.stream.Collectors;

public class B11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> result = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        int count = 0;
        while (!queue.isEmpty()) {
            count++;
            if (count % k == 0) {
                result.add(queue.poll());
            } else {
                queue.add(queue.poll());
            }
        }

        String answer = result.stream()
                .map(i -> Integer.toString(i))
                .collect(Collectors.joining(", "));
        System.out.println("<" + answer + ">");
    }
}
