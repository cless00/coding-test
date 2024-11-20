package hackerrank.noprefix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'noPrefix' function below.
     *
     * The function accepts STRING_ARRAY words as parameter.
     */

    public static void noPrefix(List<String> words) {
        // Write your code here
        // startWith() 대신 분해된 문자열을 contains()를 사용해서 속도 업
        Set<String> visitedWords = new HashSet<>();
        Set<String> subWords = new HashSet<>();

        for (String word : words) {
            if (subWords.contains(word)) {
                System.out.println("BAD SET\n" + word);
                return;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                sb.append(word.charAt(i));
                if (visitedWords.contains(sb.toString())) {
                    System.out.println("BAD SET\n" + word);
                    return;
                }
                subWords.add(sb.toString());
            }

            visitedWords.add(word);
        }

        System.out.println("GOOD SET");
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> words = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        Result.noPrefix(words);

        bufferedReader.close();
    }
}
