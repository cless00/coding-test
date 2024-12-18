package leetcode.sudoku;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] subs = new HashSet[9];
        int[] rowCount = new int[9];
        int[] colCount = new int[9];
        int[] subCount = new int[9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (rows[i] == null) rows[i] = new HashSet<>();
                if (cols[j] == null) cols[j] = new HashSet<>();
                int ss = (i / 3) * 3 + j / 3;
                if (subs[ss] == null) subs[ss] = new HashSet<>();

                if (board[i][j] == '.') continue;

                rows[i].add(board[i][j]);
                rowCount[i] += 1;

                cols[j].add(board[i][j]);
                colCount[j] += 1;

                subs[ss].add(board[i][j]);
                subCount[ss] += 1;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (rows[i].size() != rowCount[i] ||
                    cols[i].size() != colCount[i] ||
                    subs[i].size() != subCount[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        boolean answer = true;

        boolean result = solution.isValidSudoku(board);
        System.out.println(result == answer ? "success" : "fail");
    }
}
