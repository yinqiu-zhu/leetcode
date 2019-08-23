package ch5_BinaryTree.N236LowestCommonAncestorOfABinaryTree;

import ch5_BinaryTree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

  TreeNode p,q;

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null ) return null;
    this.p = p;
    this.q = q;
  }

  public TreeNode dfs(TreeNode root){
    TreeNode left = null, right = null, cur = null;


    if (root.left != null) left = dfs(root.left);
    if (root.right != null) right = dfs(root.right);
    if (left == null && right == null && root != p && root != q) return null;
    else {
      if (root == p) cur = p;
      if (root == q) cur = q;
      if ( left != null || right != null)
    }
  }
}