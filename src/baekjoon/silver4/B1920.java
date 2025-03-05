package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted().toArray();
//        System.out.println(Arrays.stream(nums).mapToObj(Integer::toString).reduce("", String::concat));

        int m = Integer.parseInt(br.readLine());
        int[] targets = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
//        System.out.println(Arrays.stream(targets).mapToObj(Integer::toString).reduce("", String::concat));

        for (int i = 0; i < m; i++) {
            int left = 0;
            int right = n;
            boolean found = false;
            while (left < right) {
                int pos = (left + right) / 2;
                if (nums[pos] == targets[i]) {
                    found = true;
                    break;
                } else if (nums[pos] > targets[i]) {
                    right = pos;
                } else {
                    left = pos + 1;
                }
            }
            System.out.println(found ? "1" : "0");
        }
    }
}
