package hackerrank.queue;

import java.util.Scanner;

public class Solution {

    //10      q = 10 (number of queries)
    //1 42    1st query, enqueue 42
    //2       dequeue front element
    //1 14    enqueue 42
    //3       print the front element
    //1 28    enqueue 28
    //3       print the front element
    //1 60    enqueue 60
    //1 78    enqueue 78
    //2       dequeue front element
    //2       dequeue front element

    //10
    //1 1
    //3
    //1 2
    //3
    //1 3
    //3
    //2
    //3
    //2
    //3
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        CustomQueue queue = new CustomQueue();
        for (int i = 0; i < q; i++) {
            int op = sc.nextInt();
            if (op == 1) {
                queue.enqueue(sc.nextLong());
            } else if (op == 2) {
                queue.dequeue();
            } else {
                queue.printFront();
            }
        }
        sc.close();
    }

    private static class CustomQueue {
        private CustomData head = null;
        private CustomData end = null;

        private void enqueue(long value) {
            CustomData data = new CustomData(value);
            if (end == null) {
                end = data;
                head = end;
            } else {
                end.next = data;
                end = end.next;
            }
        }

        private void dequeue() {
            if (head != null) {
                head = head.next;
                if (head == null) {
                    end = null;
                }
            }
        }

        private void printFront() {
            if (head != null) {
                System.out.println(head.value);
            }
        }
    }

    private static class CustomData {
        public long value;
        public CustomData next;

        public CustomData(long value) {
            this.value = value;
        }
    }
}
