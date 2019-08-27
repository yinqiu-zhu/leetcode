package ch6_NaryTree.EncodeNaryTreeToBinaryTree;

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

import ch6_NaryTree.Node;

import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Codec {

  // Encodes an n-ary tree to a binary tree.

  public TreeNode encode(Node root) {

    if (root == null) return null;

    List<Node> one = new LinkedList<>();
    one.add(root);
    return enHelper(one);
  }

  public TreeNode enHelper(List<Node> list){

    if (list == null) return null;

    TreeNode dummy = new TreeNode(0), temp = dummy;

    for (Node child : list){
      temp.right = new TreeNode(child.val);
      temp.right.left = enHelper(child.children);
      temp = temp.right;
    }

    return dummy.right;
  }

  // Decodes your binary tree to an n-ary tree.
  public Node decode(TreeNode root) {
    if (root == null) return null;
    List<Node> list = new LinkedList<>();

    return deHelper(root,list);
  }

  public Node deHelper(TreeNode root, List<Node> list){

    Node rt = new Node();
    rt.val = root.val;
    list.add(rt);

    if (root.left!= null) {
      List<Node> children = new LinkedList<>();
      rt.children = children;
      deHelper(root.left, rt.children);
    }
    if (root.right!= null) {
      list.add(rt);
      deHelper(root.right, list);
    }

    return rt;
  }

  public static void main(String[] args) {
    Codec one = new Codec();
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

   sout(one.encode(a1));
  }

  public static void sout(TreeNode root){
    if (root == null){
      System.out.println("N");
      return;
    };
    System.out.println(root.val);
    sout(root.left);
    sout(root.right);
  }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(root));