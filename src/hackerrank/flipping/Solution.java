package hackerrank.flipping;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;


class Result {

    /*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     *
     * 입력된 행령의 1분면의 합계 최대를 구하시오. 행/열을 마음껏 뒤집을 수 있음.
     * 풀이 방법: 가로/세로 가운데를 자른다고 생각하고 대칭이 되는 위치에 있는 수들 중 제일 큰것만 찾아서 더하면 됩.
     *
     * 테스트 값:
1
2
112 42 83 119
56 125 56 49
15 78 101 43
62 98 114 108
     *
     * 결과: 414
     *
     */

    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        int sum = 0;
        int n = matrix.size();

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                sum += Math.max(
                        Math.max(matrix.get(i).get(j), matrix.get(i).get(n - j - 1)),
                        Math.max(matrix.get(n - i - 1).get(j), matrix.get(n - i - 1).get(n - j - 1)));
            }
        }

        return sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        int result = Result.flippingMatrix(Arrays.asList(
                Arrays.asList(112, 42, 83, 119),
                Arrays.asList(56, 125, 56, 49),
                Arrays.asList(15, 78, 101, 43),
                Arrays.asList(62, 98, 114, 108)
        ));
        System.out.println(result);

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int q = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, q).forEach(qItr -> {
//            try {
//                int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//                List<List<Integer>> matrix = new ArrayList<>();
//
//                IntStream.range(0, 2 * n).forEach(i -> {
//                    try {
//                        matrix.add(
//                                Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                                        .map(Integer::parseInt)
//                                        .collect(toList())
//                        );
//                    } catch (IOException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                });
//
//                int result = Result.flippingMatrix(matrix);
//
//                bufferedWriter.write(String.valueOf(result));
//                bufferedWriter.newLine();
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
