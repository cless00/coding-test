package baekjoon.a8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int numCode = sc.nextInt();

        int num = n;
        List<String> list = new ArrayList<>();
        while (num >= numCode) {
            int quotient = num / numCode;
            int remainder = num % numCode;
            list.add(0, remainder >= 10 ? "" + (char) (remainder + 'A' - 10) : Integer.toString(remainder));
            num = quotient;
        }
        list.add(0, num >= 10 ? "" + (char) (num + 'A' - 10) : Integer.toString(num));

        String result = String.join("", list);
        System.out.println(result);

        sc.close();
    }
}
