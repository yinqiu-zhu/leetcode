package ch2_LinkedList.OddEvenLinkedList_8;

public class Solution {
  public ListNode oddEvenList(ListNode head) {

    if (head == null) return head;

    ListNode pointer = head;
    ListNode tail = head.next;
    ListNode temp;

    while (tail != null && tail.next != null){

     temp = tail.next.next;
     tail.next.next = pointer.next;
     pointer.next = tail.next;
     tail.next = temp;

     pointer = pointer.next;
     tail = temp;

    }

    return head;

  }
}
