package first2last.N2.N203RemoveLinkedListElements;

public class Solution {

  public ListNode removeElements(ListNode head, int val) {

      while (head != null && head.val == val) {
        head = head.next;
      }

      if (head == null) return head;

      ListNode pointer = head;
      while (pointer.next != null){

        if (pointer.next.val == val) {
          pointer.next = pointer.next.next;
        }
        else pointer = pointer.next;
      }

    return head;

  }
}
