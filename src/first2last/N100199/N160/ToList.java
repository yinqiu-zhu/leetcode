package first2last.N100199.N160;


public class ToList {

  public ListNode ToList(int[] nums){
    if (nums == null) return null;

    ListNode head = new ListNode(nums[0]);

    for (int i = 1; i <nums.length; i++){
      head.next = new ListNode(nums[i]);
    }

    return head;
  }

  public ListNode app(ListNode a,ListNode b){

    if (a == null) return b;

    ListNode head = a;

    while (a != null && a.next != null) a = a.next;

    a.next = b;

    return head;
  }
}
