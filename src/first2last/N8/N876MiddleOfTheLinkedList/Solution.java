package first2last.N8.N876MiddleOfTheLinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode fast = head, low = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            low = low.next;
        }
        return low;
    }
}