package old.ch2_LinkedList.ReverseLinkedList_6;

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
