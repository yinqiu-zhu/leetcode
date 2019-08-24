package ch6_NaryTree.N429NaryTreeLevelOrderTraversal;

import ch6_NaryTree.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
  public List<List<Integer>> levelOrder(Node root) {

    List<List<Integer>> res = new LinkedList<>();
    if (root == null) return res;

    Queue<List<Node>> queue = new LinkedList<>();
    List<Node> rt = new LinkedList<>();
    rt.add(root);
    queue.offer(rt);

    while (!queue.isEmpty()){
      List<Integer> theLevel = new LinkedList<>();
      int size = queue.size();

      for (int i = 0; i < size; i++ ){
        List<Node> temp = queue.poll();
        for (Node one : temp){
          if (one.children != null)
          queue.offer(one.children);
          theLevel.add(one.val);
        }
      }
      if (theLevel.size() != 0)
      res.add(theLevel);
    }

    return res;
  }

  public static void main(String[] args) {
    Solution one = new Solution();
    Node a1 = new Node();
    Node a2 = new Node();
    Node a3 = new Node();
    Node a4 = new Node();
    Node a5 = new Node();
    Node a6 = new Node();
    a1.val = 1;
    List<Node> a1_c = new LinkedList<>();
    a1_c.add(a3);
    a1_c.add(a2);
    a1_c.add(a4);
    a2.val = 2;
    a3.val = 3;
    a4.val = 4;
    List<Node> a3_c = new LinkedList<>();
    a3_c.add(a5);
    a3_c.add(a6);
    a5.val = 5;
    a6.val = 6;
    a3.children = a3_c;
    a1.children= a1_c;

    one.levelOrder(a1);
  }
}