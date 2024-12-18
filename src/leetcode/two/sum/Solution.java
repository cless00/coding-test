package leetcode.two.sum;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (true) {
            if (numbers[l] + numbers[r] == target) {
                return new int[]{l + 1, r + 1};
            } else if (numbers[l] + numbers[r] > target) {
                r--;
            } else {
                l++;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] answer = {1, 2};

        int[] result = solution.twoSum(numbers, target);
        System.out.println(result[0] == answer[0] && result[1] == answer[1] ? "success" : "fail");
    }
}
