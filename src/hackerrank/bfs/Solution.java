package hackerrank.bfs;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;


class Result {

    /*
     * Complete the 'bfs' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     *  3. 2D_INTEGER_ARRAY edges
     *  4. INTEGER s
     */

    public static List<Integer> bfs(int n, int m, List<List<Integer>> edges, int s) {
        // Write your code here
        int[] result = new int[n];
        Arrays.fill(result, -1);

        Queue<Node> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];

        queue.add(Node.of(s, 0));
        visited[s] = true;

        while (!queue.isEmpty()) {
            Node from = queue.poll();
            result[from.value - 1] = from.depth * 6;
            for (int i = 0; i < m; i++) {
                if (from.value == edges.get(i).get(0)) {
                    if (!visited[edges.get(i).get(1)]) {
                        visited[edges.get(i).get(1)] = true;
                        queue.add(Node.of(edges.get(i).get(1), from.depth + 1));
                    }
                } else if (from.value == edges.get(i).get(1)) {
                    if (!visited[edges.get(i).get(0)]) {
                        visited[edges.get(i).get(0)] = true;
                        queue.add(Node.of(edges.get(i).get(0), from.depth + 1));
                    }
                }
            }
        }
        List<Integer> dis = Arrays.stream(result).boxed().collect(Collectors.toList());
        dis.remove(s - 1);
        return dis;
    }

    private static class Node {
        int value;
        int depth;

        public static Node of(int value, int depth) {
            return new Node(value, depth);
        }

        public Node(int value, int depth) {
            this.value = value;
            this.depth = depth;
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {

        int n = 5;
        int m = 3;
        int s = 1;
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(List.of(1, 2));
        edges.add(List.of(1, 3));
        edges.add(List.of(3, 4));
        List<Integer> result = Result.bfs(n, m, edges, s);
        System.out.println(result.stream().map(Objects::toString)
                .collect(joining(" ")));

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int q = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, q).forEach(qItr -> {
//            try {
//                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//                int n = Integer.parseInt(firstMultipleInput[0]);
//
//                int m = Integer.parseInt(firstMultipleInput[1]);
//
//                List<List<Integer>> edges = new ArrayList<>();
//
//                IntStream.range(0, m).forEach(i -> {
//                    try {
//                        edges.add(
//                                Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                                        .map(Integer::parseInt)
//                                        .collect(toList())
//                        );
//                    } catch (IOException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                });
//
//                int s = Integer.parseInt(bufferedReader.readLine().trim());
//
//                List<Integer> result = Result.bfs(n, m, edges, s);
//
//                bufferedWriter.write(
//                        result.stream()
//                                .map(Object::toString)
//                                .collect(joining(" "))
//                                + "\n"
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
