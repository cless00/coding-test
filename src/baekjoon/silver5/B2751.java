package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2751 {
    public static void main2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] nums = new boolean[2_000_002];
        for (int i = 1; i <= n; i++) {
            int pos = Integer.parseInt(br.readLine());
            nums[pos + 1_000_000] = true;
        }
        for (int i = 0; i < 2_000_001; i++) {
            if (nums[i]) {
                System.out.println(i - 1_000_000);
            }
        }
    }
}
