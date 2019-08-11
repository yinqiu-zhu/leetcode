package ch2_LinkedList.InsertIntoACyclicSortedList_14;


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
