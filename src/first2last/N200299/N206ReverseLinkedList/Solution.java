package first2last.N200299.N206ReverseLinkedList;

public class Solution {

  public ListNode reverseList(ListNode head) {

    ListNode tail = head;


    while (tail.next != null){

      ListNode temp = tail.next;
      tail.next = temp.next;
      temp.next = head;
      head = temp;

    }

    return head;
  }

}
