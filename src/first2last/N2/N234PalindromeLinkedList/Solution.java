package first2last.N2.N234PalindromeLinkedList;

public class Solution {
  public boolean isPalindrome(ListNode head) {

    if (head == null) return true;

    ListNode start = new ListNode(0);

    start.next = head;

    ListNode faster = start, slower = start, rupt = slower.next, temp;

    while (faster.next != null && faster.next.next != null){

      faster = faster.next.next;

      temp = slower;
      slower = rupt;
      rupt = rupt.next;
      slower.next = temp;

    }

    if (faster.next != null) rupt = rupt.next;

    while (rupt != null){
      if (rupt.val != slower.val) return false;
      rupt = rupt.next;
      slower = slower.next;
    }

    return true;

  }
}
