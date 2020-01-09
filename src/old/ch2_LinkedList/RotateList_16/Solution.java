package old.ch2_LinkedList.RotateList_16;



class Solution {
  /**
 * Definition for singly-linked list. */
public class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
}
  public ListNode rotateRight(ListNode head, int k) {

  if (head == null ) return head;

  int count = 1;
  ListNode cur = head;

  while (cur.next != null){
    cur = cur.next;
    count ++;
  }

  if (k % count == 0) return head;

  count = count - (k % count );
  ListNode temp = head;

  for ( int i = 1; i < count; i++) temp = temp.next;

  ListNode start = temp.next;
  temp.next = null;
  cur.next = head;

  return start;
  }
}
