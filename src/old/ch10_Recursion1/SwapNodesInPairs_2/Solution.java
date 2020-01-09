package old.ch10_Recursion1.SwapNodesInPairs_2;

public class Solution {

  /**
   * Definition for singly-linked list.
   * */


    public ListNode swapPairs(ListNode head) {

      if ( head == null ||head.next == null) return head;

      ListNode temp = head.next.next;
      ListNode one = head;
      head = head.next;
      head.next = one;

      one.next = swapPairs(temp);

      return head;

    }

  public static void main(String[] args) {
    ListNode a0 = new ListNode(0);
    ListNode a1 = new ListNode(1);
    ListNode a2 = new ListNode(2);
    ListNode a3 = new ListNode(3);
    ListNode a4 = new ListNode(4);
    ListNode a5 = new ListNode(5);
    a0.next = a1;
    a1.next = a2;
    a2.next = a3;
    a3.next = a4;
    a4.next = a5;

    Solution one = new Solution();
    ListNode res = one.swapPairs(a0);
    while (res != null){
      res = res.next;
    }
  }
  }

