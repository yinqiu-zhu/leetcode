package first2last.N5.N590NaryTreePostorderTraversal;

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

  List<Integer> post;

  public List<Integer> postorder(Node root) {

    post = new LinkedList<>();
    if (root == null) return post;
    helper(root);

    return post;
  }

  public void helper(Node root){

    if (root == null) return;
    for (Node child : root.children)
      helper(child);
    post.add(root.val);
  }
}