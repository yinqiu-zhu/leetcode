package ch5_BinaryTree.N112PathSum;

import ch5_BinaryTree.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
      if(root == null) return false;

      if(root.left == null && root.right == null && sum == root.val) return true;

      return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
  }
