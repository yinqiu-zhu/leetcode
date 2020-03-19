package first2last.N001099.N002;

public class Solution {
    /*
    2. Add Two Numbers  M
    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     */

    /**
     * Definition for singly-linked list.
     **/
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    int carry = 0; // to indicate whether a carry is needed.

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {

        /**
         * Runtime: 2 ms, faster than 67.52% of Java online submissions for Add Two Numbers.
         * Memory Usage: 43.5 MB, less than 88.09% of Java online submissions for Add Two Numbers.
         */

        ListNode res = new ListNode(0);
        ListNode head = res;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                head.next = sum(0, l2.val);
                l2 = l2.next;
            } else if (l2 == null) {
                head.next = sum(l1.val, 0);
                l1 = l1.next;
            } else {
                head.next = sum(l1.val, l2.val);
                l1 = l1.next;
                l2 = l2.next;
            }
            head = head.next;
        }

        if (carry == 1)
            head.next = new ListNode(1);

        return res.next == null ? res : res.next;
    }

    private ListNode sum(int n1, int n2) {
        n1 = n1 + n2 + carry;
        if (n1 >= 10) {
            carry = 1;
            return new ListNode(n1 - 10);
        } else {
            carry = 0;
            return new ListNode(n1);
        }
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {

        /**
         * Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Two Numbers.
         * Memory Usage: 44.8 MB, less than 85.58% of Java online submissions for Add Two Numbers.
         */

        if (l1 == null && l2 == null) {
            if (carry == 0) {
                return null;
            } else return new ListNode(1);
        }
        if (l1 == null) {
            ListNode res = sum(0, l2.val);
            res.next = addTwoNumbers2(null, l2.next);
            return res;
        }
        if (l2 == null) {
            ListNode res = sum(l1.val, 0);
            res.next = addTwoNumbers2(l1.next, null);
            return res;
        } else {
            ListNode res = sum(l1.val, l2.val);
            res.next = addTwoNumbers2(l1.next, l2.next);
            return res;
        }

    }


    public static void main(String[] args) {
        Solution test = new Solution();
        Solution.ListNode a = new ListNode(0);
        Solution.ListNode b = new ListNode(7);
        Solution.ListNode c = new ListNode(3);
        b.next = c;

        test.addTwoNumbers2(a, b);

    }
}
