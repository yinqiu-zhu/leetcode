package first2last.N1.N116PopulatingNextRightPointersInEachNode;

public class Node {

    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
      val = _val;
      left = _left;
      right = _right;
      next = _next;
    }
}
