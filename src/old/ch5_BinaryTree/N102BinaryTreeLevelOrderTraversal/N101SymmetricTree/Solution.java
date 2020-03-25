package old.ch5_BinaryTree.N101SymmetricTree;

public class Solution {

  public boolean isSymmetric(TreeNode root) {

    if (root == null) return true;

    return lowLevelComparision(root.left, root.right);
  }

  public boolean lowLevelComparision(TreeNode left, TreeNode right){
    if (left == null && right == null) return true;
    if (left == null || right == null) return false;
    return left.val == right.val &&
        lowLevelComparision(left.left, right.right) &&
            lowLevelComparision(left.right, right.left);
  }
}
