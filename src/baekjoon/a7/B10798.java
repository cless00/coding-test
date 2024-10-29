package baekjoon.a7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<char[]> chars = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            chars.add(sc.nextLine().toCharArray());
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (chars.get(j).length > i) {
                    System.out.print(chars.get(j)[i]);
                }
            }
        }
    }
}
