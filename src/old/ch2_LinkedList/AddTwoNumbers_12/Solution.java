package old.ch2_LinkedList.AddTwoNumbers_12;


public class Solution {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    // initialize: No exception.

    // initialize: pointers for list.
    int carry = 0;
    ListNode head = new ListNode(0);
    ListNode cur = head, p1 = l1, p2 = l2;

    // body: main manipulation.
    while (l1 != null || l2 != null){

      int i = l1==null? 0 : l1.val;
      int j = l2==null? 0 : l2.val;
      int sum = i + j + carry;
      if (sum > 9) {
        carry = 1;
        sum = sum - 10;
      }
      else carry = 0;

      ListNode next = new ListNode(sum);
      cur.next = next;
      cur = cur.next;
      l1 = l1 == null? l1 : l1.next;
      l2 = l2 == null? l2 : l2.next;

    }

    // body: exception.

    if (carry == 1) {
      ListNode next = new ListNode(1);
      cur.next = next;
    }

    //return
    return head.next;
  }
  public static void main(String[] args) {
    ListNode l1 = new ListNode(5);
    ListNode l2 = new ListNode(5);
    Solution r = new Solution();
    ListNode res;
    res = r.addTwoNumbers(l1,l2);
  }
}

