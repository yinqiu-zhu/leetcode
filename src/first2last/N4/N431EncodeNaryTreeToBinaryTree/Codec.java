package first2last.N4.N431EncodeNaryTreeToBinaryTree;

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

    TreeNode rt = new TreeNode(root.val);
    rt.left = enHelper(root);

    return rt;
  }

  public TreeNode enHelper(Node root){

    if (root.children == null) return null;

    TreeNode dummy = new TreeNode(0), temp = dummy;


    for (int i = 0; i < root.children.size(); i++){
      Node one = root.children.get(i);
      temp.right = new TreeNode(one.val);
      temp = temp.right;
      temp.left = enHelper(one);
    }

    return dummy.right;
  }

  // Decodes your binary tree to an n-ary tree.
  public Node decode(TreeNode root) {
    if (root == null) return null;
    return deHelper(root);
  }

  public Node deHelper(TreeNode root){

    Node rt = new Node();
    rt.val = root.val;
    rt.children = new LinkedList<>();

    TreeNode temp = root.left;
    while (temp != null){
      rt.children.add(deHelper(temp));
      temp = temp.right;
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

    TreeNode a = one.encode(a1);
    soutT(a);
   soutN(one.decode(a));
  }

  public static void soutT(TreeNode root){
    if (root == null){
      System.out.println("N");
      return;
    };
    System.out.println(root.val);
    soutT(root.left);
    soutT(root.right);
  }

  public static void soutN(Node root){
    if (root == null){
      System.out.println("N");
      return; }
    System.out.println(root.val);
    if (root.children != null)
    for (Node a : root.children){
      soutN(a);
    }
  }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(root));