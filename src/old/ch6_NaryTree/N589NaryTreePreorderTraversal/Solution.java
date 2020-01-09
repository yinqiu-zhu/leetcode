package old.ch6_NaryTree.N589NaryTreePreorderTraversal;

import old.ch6_NaryTree.Node;

import java.util.LinkedList;
import java.util.List;

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
public class Solution {

  List<Integer> pre;

  public List<Integer> preorder(Node root) {

    pre = new LinkedList<>();
    if (root == null) return pre;
     helper(root);

     return pre;
  }

  public void helper(Node root){

    if (root == null) return;

    pre.add(root.val);
    for (Node child : root.children)
      helper(child);
  }
}
