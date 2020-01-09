package old.ch2_LinkedList.CopyListWithRandomPointer_15;

public class Solution {


// Definition for a Node.



  public Node copyRandomList(Node head) {

    if (head == null) return null;

    Node cur = head;
    Node temp = head.next;

    while (cur != null){

    Node one = new Node(cur.val, cur.next, null);
    temp = cur.next;
    cur.next = one;
    one.next = temp;
    cur = cur.next.next;
    }

    cur = head;

    while (cur != null){

      if (cur.random != null)  cur.next.random = cur.random.next;
      cur = cur.next.next;
    }

    cur = head;
    temp = head.next;
    Node start = temp;

    while (temp != null) {
      cur.next = temp.next;
      if (temp.next != null) temp.next = cur.next.next;

      cur = cur.next;
      temp = temp.next;
    }
    return start;
  }

  public static void main(String[] args) {

    {
    Node a1 = new Node(1, null, null);
    Node a2 = new Node(2,null,null);
    a1.next = a2;
    a1.random = a2;
    a2.random = a2;
    Solution a = new Solution();
    a.copyRandomList(a1);
    }

    {
      Node a1 = new Node(1, null, null);
      Solution a = new Solution();
      a.copyRandomList(a1);
    }
    {
      Node a5 = new Node(4, null, null);
      Node a4 = new Node(-3,a5,null);
      Node a3 = new Node(7, a4, null);
      Node a2 = new Node(8,a3,null);
      Node a1 = new Node(-1, a2, null);

      a1.random = a5;
      a2.random = a4;
      a5.random = a1;
      Solution a = new Solution();
      a.copyRandomList(a1);
    }
  }

}
