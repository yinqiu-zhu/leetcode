package ch2_LinkedList.InsertIntoACyclicSortedList_14;

public class Solution {

// Definition for a Node.


  public Node insert(Node head, int insertVal) {

    Node temp = new Node(insertVal, null);

  if (head ==  null){
    temp.next = temp;
    return temp;
  }

    Node cur = head;

  if (cur.val >= insertVal) {
    while (cur.val <= cur.next.val && cur.next != head) {
      cur = cur.next;
    }
  }

    if (cur.next.val < insertVal) {

      cur = cur.next;

      while (cur.val <= cur.next.val && cur != head && cur.next.val < insertVal) {
        cur = cur.next;
      }
  }
    Node one = cur.next;
    cur.next = temp;
    temp.next = one;

  return head;
  }

  public static void main(String[] args) {
    Solution a = new Solution();
    {
    Node a1 = new Node(1,null);
    Node a4 = new Node(4,a1);
    Node a3 = new Node(3,a4);

    a1.next = a4;

    a.insert(a3,2);}

    {
      Node b1 = new Node(1);
      b1.next = b1;
      a.insert(b1,2);
    }
  }
}
