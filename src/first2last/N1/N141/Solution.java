package first2last.N1.N141;

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {

  class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  public boolean hasCycle(ListNode head) {

    if (head == null) return false;

    ListNode faster=head, slower=head;

    while (faster != null && faster.next != null){

      faster = faster.next.next;
      slower = slower.next;

      if (faster == slower) return true;
    }

    return false;

  }
}
