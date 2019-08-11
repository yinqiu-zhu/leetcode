package ch2_LinkedList.IntersectionOfTwoLinkedLists_4;

public class Solution {


  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

    if (headA == null || headB==null) return null;

    ListNode A= headA, B = headB;

    while (A != null && B != null){
      A = A.next;
      B = B.next;
    }

    if (B == null ){
      while (A != null){
        A = A.next;
        headA = headA.next;
      }
    }
    else if (A == null){
      while (B != null){
        B = B.next;
        headB = headB.next;
      }
    }

    while (headA != null){
      if (headB == headA) return headA;
      headA=headA.next;
      headB=headB.next;
    }
    return null;
  }

  public static void main(String[] args) {

    ToList fun = new ToList();
    Solution re = new Solution();

    {
      int[]a ={1,2};
      int[] b = {5};
      int[] c = {3,4};
      ListNode A =fun.ToList(a);
      ListNode B =fun.ToList(a);
      ListNode C =fun.ToList(a);

      ListNode AC = fun.app(A,C);
      ListNode BC = fun.app(B,C);

      ListNode res = re.getIntersectionNode(AC,BC);
    }
  }
}
