package ch2_LinkedList.IntersectionOfTwoLinkedLists_4;


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
