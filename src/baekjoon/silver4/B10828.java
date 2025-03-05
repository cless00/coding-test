package baekjoon.silver4;

import java.util.Scanner;

public class B10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack stack = new Stack();
        for (int i = 0; i < n; i++) {
            String op = sc.next();
            switch (op) {
                case "push":
                    stack.push(sc.nextInt());
                    break;
                case "pop":
                    stack.pop();
                    break;
                case "size":
                    stack.size();
                    break;
                case "empty":
                    stack.empty();
                    break;
                case "top":
                    stack.top();
                    break;
            }
        }
    }

    static class Stack {
        private int pos = 0;
        private final int[] stack = new int[10_000];

        public void push(int value) {
            stack[pos++] = value;
        }

        public void pop() {
            if (pos == 0) {
                System.out.println("-1");
            } else {
                System.out.println(stack[--pos]);
            }
        }

        public void size() {
            System.out.println(pos);
        }

        public void empty() {
            System.out.println(pos > 0 ? "0" : "1");
        }

        public void top() {
            if (pos == 0) {
                System.out.println("-1");
            } else {
                System.out.println(stack[pos - 1]);
            }
        }
    }
}
