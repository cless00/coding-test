package baekjoon.bronze1;

import java.io.*;

// https://www.acmicpc.net/problem/10989
public class B10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[] sort = new int[10001];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(bf.readLine());
            sort[num]++;
        }
        for (int i = 0; i < 10001; i++) {
            for (int j = 0; j < sort[i]; j++) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
