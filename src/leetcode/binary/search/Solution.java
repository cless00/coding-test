package leetcode.binary.search;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int min = 0;
        int max = m * n - 1;
        
        while (max >= min) {
            int mid = (min + max) / 2;
            int row = mid / n;
            int col = mid % n;
            int value = matrix[row][col];

            if (value == target) {
                return true;
            } else if (value > target) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean answer = true;
        boolean result = solution.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3);
        System.out.println(answer == result ? "success" : "failed");
    }
}
