package first2last.N100199.N104MaximumDepthOfBinaryTree;

class Solution {
  public int maxDepth(TreeNode root) {

    if (root == null) return 0;

    return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;

  }
}
