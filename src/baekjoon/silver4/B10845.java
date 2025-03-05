package baekjoon.silver4;

import java.util.Scanner;

public class B10845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue queue = new Queue();
        for (int i = 0; i < n; i++) {
            String op = sc.next();
            switch (op) {
                case "push":
                    queue.push(sc.nextInt());
                    break;
                case "pop":
                    queue.pop();
                    break;
                case "size":
                    queue.size();
                    break;
                case "empty":
                    queue.empty();
                    break;
                case "front":
                    queue.front();
                    break;
                case "back":
                    queue.back();
                    break;
            }
        }
    }

    static class Queue {
        private int head = 0;
        private int tail = 0;
        private int[] queue = new int[10_000];

        public void push(int x) {
            queue[tail++] = x;
        }

        public void pop() {
            if (head == tail) {
                System.out.println(-1);
            } else {
                System.out.println(queue[head++]);
            }
        }

        public void size() {
            System.out.println(tail - head);
        }

        public void empty() {
            System.out.println(tail == head ? 1 : 0);
        }

        public void front() {
            if (head == tail) {
                System.out.println(-1);
            } else {
                System.out.println(queue[head]);
            }
        }

        public void back() {
            if (head == tail) {
                System.out.println(-1);
            } else {
                System.out.println(queue[tail - 1]);
            }
        }
    }
}
