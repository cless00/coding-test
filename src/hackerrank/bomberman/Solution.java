package hackerrank.bomberman;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'bomberMan' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING_ARRAY grid
     *
     *
     * 1초 후: 그대로
     * 2초 후: 전부
     * 3초 후: 터짐
     * 4초 후: 전부
     * 5초 후: 터짐2
     * 6초 후: 전부
     * 7초 후: 터짐1
     * 8초 후: 전부
     * 9초 후: 터짐2 반복...
     */

    public static List<String> bomberMan(int n, List<String> grid) {
        // Write your code here

        List<String> all = new ArrayList<>();
        for (int row = 0; row < grid.size(); row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < grid.get(0).length(); col++) {
                sb.append("O");
            }
            all.add(sb.toString());
        }

        List<String> alter = new ArrayList<>(all);
        for (int row = 0; row < grid.size(); row++) {
            for (int col = 0; col < grid.get(0).length(); col++) {
                if (grid.get(row).charAt(col) == 'O') {
                    alter.set(row, removeBomb(alter.get(row), col));
                    alter.set(row, removeBomb(alter.get(row), col - 1));
                    alter.set(row, removeBomb(alter.get(row), col + 1));
                    if (row > 0)
                        alter.set(row - 1, removeBomb(alter.get(row - 1), col));
                    if (row + 1 < grid.size())
                        alter.set(row + 1, removeBomb(alter.get(row + 1), col));
                }
            }
        }

        List<String> alter2 = new ArrayList<>(all);
        for (int row = 0; row < grid.size(); row++) {
            for (int col = 0; col < grid.get(0).length(); col++) {
                if (alter.get(row).charAt(col) == 'O') {
                    alter2.set(row, removeBomb(alter2.get(row), col));
                    alter2.set(row, removeBomb(alter2.get(row), col - 1));
                    alter2.set(row, removeBomb(alter2.get(row), col + 1));
                    if (row > 0)
                        alter2.set(row - 1, removeBomb(alter2.get(row - 1), col));
                    if (row + 1 < grid.size())
                        alter2.set(row + 1, removeBomb(alter2.get(row + 1), col));
                }
            }
        }

        if (n == 1) {
            return grid;
        } else if (n % 4 == 3) {
            return alter;
        } else if (n % 4 == 1) {
            return alter2;
        } else {
            return all;
        }
    }

    private static String removeBomb(String origin, int col) {
        if (col < 0 || col >= origin.length()) {
            return origin;
        }
        return origin.substring(0, col) + "." + origin.substring(col + 1);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int r = Integer.parseInt(firstMultipleInput[0]);

        int c = Integer.parseInt(firstMultipleInput[1]);

        int n = Integer.parseInt(firstMultipleInput[2]);

        List<String> grid = IntStream.range(0, r).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<String> result = Result.bomberMan(n, grid);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

