package baekjoon.silver4;

import java.io.*;
import java.util.Arrays;

public class B10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[20_000_002];
        Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(value -> nums[getIndex(value)]++);
        int m = Integer.parseInt(br.readLine());
        int[] targets = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < m; i++) {
            int target = targets[i];
            bw.write(nums[getIndex(target)] + " ");
        }

        bw.flush();
        bw.close();
    }

    private static int getIndex(int value) {
        return value + 10_000_000;
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int n = Integer.parseInt(br.readLine());
//        int[] nums = Arrays.stream(br.readLine().split(" "))
//                .mapToInt(Integer::parseInt)
//                .sorted()
//                .toArray();
//        int m = Integer.parseInt(br.readLine());
//        int[] targets = Arrays.stream(br.readLine().split(" "))
//                .mapToInt(Integer::parseInt)
//                .toArray();
//
//        for (int i = 0; i < m; i++) {
//            int pos = biSearch(nums, 0, n, targets[i]);
//            if (pos >= 0) {
//                int result = count(nums, pos);
//                bw.write(result + " ");
//            } else {
//                bw.write("0 ");
//            }
//        }
//        bw.flush();
//        bw.close();
//    }
//
//    static int biSearch(int[] nums, int left, int right, int target) {
//        if (left >= right) {
//            return -1;
//        }
//        int cur = (left + right) / 2;
//        if (nums[cur] == target) {
//            return cur;
//        } else if (nums[cur] < target) {
//            return biSearch(nums, cur + 1, right, target);
//        } else {
//            return biSearch(nums, left, cur, target);
//        }
//    }
//
//    static int count(int[] nums, int pos) {
//        int left = pos;
//        int right = pos + 1;
//        int target = nums[pos];
//        int count = 0;
//        while (left >= 0) {
//            if (nums[left] == target) {
//                left--;
//                count++;
//            } else {
//                break;
//            }
//        }
//        while (right < nums.length) {
//            if (nums[right] == target) {
//                right++;
//                count++;
//            } else {
//                break;
//            }
//        }
//        return count;
//    }
}
