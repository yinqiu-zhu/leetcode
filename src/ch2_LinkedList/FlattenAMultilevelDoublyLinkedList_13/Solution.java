package ch2_LinkedList.FlattenAMultilevelDoublyLinkedList_13;


class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }

  public Node(int _val) {
    val = _val;
  }
};

class Solution {
  public Node flatten(Node head) {

    if (head == null) return head;

    Node cur = head, temp = null;

    while (cur != null) {

      if (cur.child == null) {
        cur = cur.next;
      } else {
        temp = cur.next;
        Node one = cur.child;

        while (one.next != null){
          one = one.next;
        }

        one.next = temp;
        if (temp != null) temp.prev = one;
        cur.next = cur.child;
        cur.child.prev = cur;
        cur.child = null;

      }
    }

    return head;

  }

  public static void main(String[] args) {
    Solution one = new Solution();
    Node n0 = new Node(0);
    Node n1 = new Node(1);
    Node n2 = new Node(10);
    Node n3 = new Node(11);
    Node n4 =new Node(2);

    n0.child = n1;
    n1.child = n2;
    n2.child = n3;

    one.flatten(n0);
  }

}