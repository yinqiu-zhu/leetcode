package old.ch2_LinkedList.DesignLinkedList_10;

class MyLinkedList {

  /**
   * Initialize your data structure here.
   */

  public class Node {

    int val;
    Node next, prev;

    public Node(int val) {
      this.val = val;
    }

  }

  private Node head;

  public MyLinkedList() {

    head = null;

  }

  public Node getNode(int index){
    Node cur = head;
    int count = 0;
    while (cur != null && count < index) {
      count++;
      cur = cur.next;
    }

    return cur;
  }

  /**
   * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
   */
  public int get(int index) {

    if (index < 0 ) return  -1;

    Node cur = getNode(index);

    return cur == null ? -1 : cur.val;

  }

  /**
   * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
   */
  public void addAtHead(int val) {

    Node cur = new Node(val);
    cur.next = head;
    if (head != null) {
      head.prev = cur;
    }
    head = cur;
    return;
  }

  /**
   * Append a node of value val to the last element of the linked list.
   */
  public void addAtTail(int val) {

    if (head == null) addAtHead(val);

    else {

      Node cur = head;
      Node tail = new Node(val);

      while (cur.next != null) {
        cur = cur.next;
      }

      tail.prev = cur;
      cur.next = tail;

    }

  }

  /**
   * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
   */
  public void addAtIndex(int index, int val) {

    if (index <= 0) addAtHead(val);
    else {
      Node prev = getNode(index -1);
      if (prev != null) {
        Node one = new Node(val);
        Node next = prev.next;
        one.prev = prev;
        one.next = next;
        prev.next = one;
        if (next != null) {
          next.prev = one;
        }
      }
    }
  }

  /**
   * Delete the index-th node in the linked list, if the index is valid.
   */
  public void deleteAtIndex(int index) {

    if (index < 0) return;

    Node cur = getNode(index);
    if (cur != null) {

      Node prev = cur.prev;
      Node next = cur.next;
      if (prev != null) {
        prev.next = next;
      } else {
        // modify head when deleting the first node.
        head = next;
      }
      if (next != null) {
        next.prev = prev;
      }
    }
  }

  public static void main(String[] args) {
    {
      MyLinkedList linkedList = new MyLinkedList();
      linkedList.addAtHead(1);
      linkedList.addAtTail(3);
      linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
      linkedList.get(1);            // returns 2
      linkedList.deleteAtIndex(1);  // now the linked list is 1->3
      linkedList.get(1);            // returns 3
    }

    {
      MyLinkedList linkedList = new MyLinkedList();
      linkedList.addAtHead(5);
      linkedList.addAtHead(2);
      linkedList.deleteAtIndex(1);
      linkedList.addAtIndex(1, 9);
      linkedList.addAtHead(4);
      linkedList.addAtHead(9);
      linkedList.addAtHead(8);
      linkedList.get(3);
      linkedList.addAtTail(1);
      linkedList.addAtIndex(3, 6);
      linkedList.addAtHead(3);
    }

    {
      MyLinkedList linkedList = new MyLinkedList();
      linkedList.addAtHead(1);
      linkedList.addAtIndex(1,2);
      linkedList.get(1);
      linkedList.get(0);
      linkedList.get(2);
    }
  }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */