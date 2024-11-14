package hackerrank.queue;

import java.util.Scanner;
import java.util.Stack;

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
//        CustomQueueWithLinkedList queue = new CustomQueueWithLinkedList();
        CustomQueueWithDualStack queue = new CustomQueueWithDualStack();
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

    private static class CustomQueueWithLinkedList {
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

        private long dequeue() {
            long top = head != null ? head.value : 0;
            if (head != null) {
                head = head.next;
                if (head == null) {
                    end = null;
                }
            }
            return top;
        }

        private void printFront() {
            if (head != null) {
                System.out.println(head.value);
            }
        }
    }

    private static class CustomQueueWithDualStack {
        private final Stack<Long> inStack = new Stack<>();
        private final Stack<Long> outStack = new Stack<>();

        private void enqueue(long value) {
            inStack.push(value);
        }

        private long dequeue() {
            if (outStack.isEmpty()) {
                while (!inStack.isEmpty()) {
                    outStack.push(inStack.pop());
                }
            }
            return outStack.pop();
        }

        private void printFront() {
            if (outStack.isEmpty()) {
                while (!inStack.isEmpty()) {
                    outStack.push(inStack.pop());
                }
            }
            System.out.println(outStack.peek());
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