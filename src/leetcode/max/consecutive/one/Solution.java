package leetcode.max.consecutive.one;

public class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int zeroCount = 0;
            int j = i;
            while (j < nums.length) {
                if (nums[j] == 0) {
                    zeroCount++;
                }
                if (zeroCount > k) {
                    break;
                }
                j++;
            }

            max = Math.max(max, j - i);

            if (nums.length - i <= max) {
                break;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3);
        System.out.println(result == 10 ? "success" : "failed");
    }
}
