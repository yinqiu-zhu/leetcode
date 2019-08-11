package ch2_LinkedList.RemoveNthNodeFromEndofList_5;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode res = head;
    int count = 0;

    while (res != null){
      res = res.next;
      count++;
    }

    if (count - n -1 == -1) head= head.next;
    else {
      res = head;
      for (int i = 0; i <= count - n -1;i++ ){
        res = res.next;
      }

      res = res.next.next;
    }

    return head;
  }
}

