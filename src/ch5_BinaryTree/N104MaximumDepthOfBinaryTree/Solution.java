package ch5_BinaryTree.N104MaximumDepthOfBinaryTree;

import ch5_BinaryTree.TreeNode;

class Solution {
  public int maxDepth(TreeNode root) {

    if (root == null) return 0;

    return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;

  }
}
