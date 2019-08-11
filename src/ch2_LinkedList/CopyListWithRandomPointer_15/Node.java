package ch2_LinkedList.CopyListWithRandomPointer_15;


class Node {
  public int val;
  public Node next;
  public Node random;

  public Node(int _val,Node _next,Node _random) {
    val = _val;
    next = _next;
    random = _random;
  }
};
