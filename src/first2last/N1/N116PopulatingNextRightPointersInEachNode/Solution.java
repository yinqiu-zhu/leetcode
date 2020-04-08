package first2last.N1.N116PopulatingNextRightPointersInEachNode;

import java.util.LinkedList;
import java.util.Queue;

/*
// Definition for a Node.
class Node {
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
};
*/
class Solution {
  public Node connect(Node root) {

    //exception
    if (root == null || root.left == null) return root;

    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);
    queue.offer(null);

    while (queue.size() != 1){
      int size = queue.size();
      for (int i = 0; i < size - 1; i++ ){
        Node temp = queue.poll();
        temp.next = queue.peek();
        if (temp.left != null){
        queue.offer(temp.left);
        queue.offer(temp.right);}
      }
      queue.poll();
      queue.offer(null);
    }
    return root;
  }
}
