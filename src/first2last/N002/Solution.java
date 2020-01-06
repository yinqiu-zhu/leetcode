package first2last.N002;

public class Solution {
    /*
    2. Add Two Numbers  M
    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     */

    /**
     * Definition for singly-linked list.
     **/
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    int carry = 0; // to indicate whether a carry is needed.

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //init
        ListNode res = new ListNode(0);
        ListNode head = res;

        //body
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                head.next = sum(0, l2.val);
                l2 = l2.next;
            }
            if (l2 == null) {
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




    public static void main(String[] args) {
        Solution test = new Solution();
        Solution.ListNode a = new Solution.ListNode(0);

    }
}
