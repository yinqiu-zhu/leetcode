package first2last.N001099.N021;

public class Solution {

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    // initialize: exception.

    if (l1 == null || l2 == null) return l1 == null? l2 : l1;

    // initialize: pointers for list.
    ListNode head,cur;
    if (l1.val <= l2.val) {
      head = l1;
      l1 = l1.next;
    }
    else {
      head = l2;
      l2 = l2.next;
    }
    cur = head;

    // body: main manipulation.
    while (l1 != null && l2 != null){

      if (l1.val <= l2.val){
        cur.next = l1;
        l1 = l1.next;
      }
      else {
        cur.next = l2;
        l2 = l2.next;
      }

      cur = cur.next;
    }
    // body: exception.
    cur.next = l1 == null? l2 : l1;

    //return
    return head;
  }
}
