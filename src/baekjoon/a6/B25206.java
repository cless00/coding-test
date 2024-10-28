package baekjoon.a6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Double> convertingTable = new HashMap<>();
        convertingTable.put("A+", 4.5);
        convertingTable.put("A0", 4.0);
        convertingTable.put("B+", 3.5);
        convertingTable.put("B0", 3.0);
        convertingTable.put("C+", 2.5);
        convertingTable.put("C0", 2.0);
        convertingTable.put("D+", 1.5);
        convertingTable.put("D0", 1.0);
        convertingTable.put("F", 0.0);

        double sum = 0;
        double count = 0;
        for (int i = 0; i < 20; i++) {
            String name = sc.next();
            double point = sc.nextDouble();
            String grade = sc.next();
            if (!"P".equals(grade)) {
                sum += convertingTable.get(grade) * point;
                count += point;
            }
        }
        System.out.println(sum / count);
    }
}
