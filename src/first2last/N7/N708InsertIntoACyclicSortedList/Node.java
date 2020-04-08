package first2last.N7.N708InsertIntoACyclicSortedList;


class Node {
  int val;
  Node next;

  Node(int x) {
    val = x;
    next = null;
  }

  Node(int x, Node y) {
    val = x;
    next = y;
  }
}
