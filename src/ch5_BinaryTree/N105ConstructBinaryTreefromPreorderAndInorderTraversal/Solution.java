package ch5_BinaryTree.N105ConstructBinaryTreefromPreorderAndInorderTraversal;

import ch5_BinaryTree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  Map<Integer, Integer> map;
  int[] preorder, inorder;

  public TreeNode buildTree(int[] preorder, int[] inorder) {

    if (preorder.length == 0 || preorder.length != inorder.length || preorder == null)
      return null;

    this.preorder = preorder;
    this.inorder = inorder;

    map = new HashMap<>();
    for (int i = 0; i < inorder.length; i++)
      map.put(inorder[i] , i);

    TreeNode res = buildRoot(0, preorder.length-1, 0);

    return res;
  }

  public TreeNode buildRoot(int start, int end, int residual){

    if (start > end ) return null;
    TreeNode root = new TreeNode(preorder[start]);
    if (start == end) return root;

    int posInInorder = map.get(preorder[start]);
    root.left = buildRoot(start  + 1, posInInorder + residual, residual+1);
    root.right = buildRoot(posInInorder + residual + 1, end, residual);
    return root;

  }

  public static void main(String[] args) {

    {Solution one = new Solution();

      TreeNode x= one.buildTree(new  int[]{1,2,3}, new int[]{3,2,1});
      System.out.println( "--");

      sout(x);}
  }

  public static void sout(TreeNode root){
    if (root == null){
      System.out.println("#");
      return;
    };
    System.out.println(root.val);
    sout(root.left);
    sout(root.right);
  }
}
