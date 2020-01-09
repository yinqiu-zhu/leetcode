package old.ch2_LinkedList.DesignLinkedList_1;

class MyLinkedList {

  class Node{
    int val;
    Node next;
    public  Node(int val ){
      this.val = val;
    }
  }

  private  Node head;
  private  int size = 0;

  /** Initialize your data structure here. */
  public MyLinkedList() {

  }

  /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
  public int get(int index) {

    if (index >= size || index < 0) return  -1;

    Node cur = head;

    for (int i = 0; i < index; i++){ cur = cur.next;}

    return cur.val;

  }

  /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
  public void addAtHead(int val) {

    Node node = new Node(val);
    node.next = head;
    head = node;
    size ++;

  }

  /** Append a node of value val to the last element of the linked list. */
  public void addAtTail(int val) {

    Node node = new Node(val);
    node.next = null;
    if (head == null ) head = node;
    else {
      Node cur = head;
      while (cur.next != null) cur = cur.next;
      cur.next = node;
    }

    size ++;

  }

  /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
  public void addAtIndex(int index, int val) {

    if (index > size || index < 0) return;
    else if (index == size) {
      addAtTail(val);
    }
    else if (index == 0) addAtHead(val);
    else {
      size ++;
      Node node = new Node(val);
      Node cur = head;
      for (int i = 0; i <  index-1 ; i ++)  cur = cur.next;
      node.next = cur.next;
      cur.next = node;
    }

  }

  /** Delete the index-th node in the linked list, if the index is valid. */
  public void deleteAtIndex(int index) {

    if (index >= size || index < 0 ) return;
    if (index ==  0) {
      head = head.next;
    }
    else {
      Node cur = head;
      for (int i = 0; i < index - 1; i ++) cur = cur.next;
      cur.next = cur.next.next;
      size --;
    }

  }

  public static void main(String[] args) {
    {
      MyLinkedList LL = new MyLinkedList();
      LL.addAtHead(1);
      LL.addAtIndex(1, 2);
      LL.get(1);
      LL.get(0);
      LL.get(2);
    }
    {
      MyLinkedList LL = new MyLinkedList();
      LL.addAtHead(1);
      LL.addAtTail( 3);
      LL.addAtIndex(1,2);
      LL.get(1);
      LL.deleteAtIndex(1);
      LL.get(1);
    }
    {
      MyLinkedList LL = new MyLinkedList();
      LL.addAtIndex(-1,0);
      LL.get(0);
      LL.deleteAtIndex(-1);
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
