package leetcode.remove.from.end;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode result = dummy;

        for (int i = 0; i < n; i++) {
            head = head.next;
        }
        while (head != null) {
            head = head.next;
            dummy = dummy.next;
        }
        dummy.next = dummy.next.next;

        return result.next;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        ListNode prev = null;
        current = head;
        for (int i = 0; i < count - n; i++) {
            prev = current;
            current = current.next;
        }
        if (prev == null) {
            return head.next;
        } else {
            prev.next = current.next;
            return head;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int n = 2;
        ListNode result = solution.removeNthFromEnd(head, n);
        System.out.print("removed: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
