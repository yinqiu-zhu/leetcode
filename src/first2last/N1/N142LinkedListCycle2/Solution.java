package first2last.N1.N142LinkedListCycle2;


public class Solution {


  public ListNode detectCycle(ListNode head) {

    if (head == null) return null;

    ListNode rabbit= head, tortle = head;

    while (rabbit != null && rabbit.next != null){
      rabbit = rabbit.next.next;
      tortle = tortle.next;

      if (tortle == rabbit) {
        tortle = head;

        for ( ; tortle != rabbit; ){
          tortle= tortle.next;
          rabbit= rabbit.next;
        }

        return tortle;
      }
    }

    return null;
  }
}
