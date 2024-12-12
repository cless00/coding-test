package baekjoon.a10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B10101 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a1 = s.nextInt();
        int a2 = s.nextInt();
        int a3 = s.nextInt();

        // using set
        if (a1 + a2 + a3 != 180) {
            System.out.println("Error");
        } else if (a1 == a2 && a2 == a3) {
            System.out.println("Equilateral");
        } else {
            Set<Integer> set = new HashSet<>();
            set.add(a1);
            set.add(a2);
            set.add(a3);
            if (set.size() == 3) {
                System.out.println("Scalene");
            } else {
                System.out.println("Isosceles");
            }
        }

        // easy
//        if (a1 + a2 + a3 != 180) {
//            System.out.println("Error");
//        } else if (a1 == a2 && a2 == a3) {
//            System.out.println("Equilateral");
//        } else if (a1 == a2 || a1 == a3 || a2 == a3) {
//            System.out.println("Isosceles");
//        } else {
//            System.out.println("Scalene");
//        }

    }
}
