package first2last.N200299.N236LowestCommonAncestorOfABinaryTree;

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

    return dfs(root);
  }

  public TreeNode dfs(TreeNode root){

    if(root == p) 
      return root;
    if(root == q) 
     return root;

    TreeNode left = root.left == null? null : dfs(root.left);
    TreeNode right = root.right == null? null : dfs(root.right);
    if (left != null && right != null)
     return root;
    else if(left != null) return left;
    else if(right != null) return right;

    return null;
  }
}